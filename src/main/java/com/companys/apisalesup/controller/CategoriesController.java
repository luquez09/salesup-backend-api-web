package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.CategoriesDto;
import com.companys.apisalesup.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoriesDto> createCategory(@RequestBody CategoriesDto categoriesDto) {
        CategoriesDto saveCategoriesDto = categoryService.createCategory(categoriesDto);
        return new ResponseEntity<>(saveCategoriesDto, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CategoriesDto> searchCategoryid(@PathVariable("id") Integer idCategory) {
        CategoriesDto categoriesDto = categoryService.getCategoryId(idCategory);
        return ResponseEntity.ok(categoriesDto);
    }

    @GetMapping
    public ResponseEntity<List<CategoriesDto>> findAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategory());
    }

    @PutMapping
    public ResponseEntity<CategoriesDto> updateCategory(@RequestBody CategoriesDto categoriesDto) {
        CategoriesDto saveCategoriesDto = categoryService.updateCategory(categoriesDto);
        return new ResponseEntity<>(saveCategoriesDto, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCategory(@RequestBody CategoriesDto categoriesDto) {
        categoryService.deleteCategory(categoriesDto);
        return ResponseEntity.ok("Eliminado correctamente.");
    }
}
