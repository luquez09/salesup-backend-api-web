package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.CategoriesDto;
import com.companys.apisalesup.entity.Category;
import com.companys.apisalesup.exception.ResourceNotFoundException;
import com.companys.apisalesup.mapper.CategoriesMapper;
import com.companys.apisalesup.repository.CategoriesRepository;
import com.companys.apisalesup.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService {

    private CategoriesRepository categoriesRepository;

    @Override
    public CategoriesDto createCategory(CategoriesDto categoriesDto) {

        Category category = CategoriesMapper.mapToCategory(categoriesDto);
        Category savedCategory = categoriesRepository.save(category);

        return CategoriesMapper.mapToCategoriesDto(savedCategory);
    }

    @Override
    public CategoriesDto updateCategory(CategoriesDto categoriesDto) {

        Category categoryUpdate = categoriesRepository.findById(categoriesDto.getIdCategories())
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Categoria no encontra con id: "
                                + categoriesDto.getIdCategories())
                );

        categoryUpdate.setDescriptionCategories(categoriesDto.getDescriptionCategories());
        categoryUpdate.setNameCategories(categoriesDto.getNameCategories());
        return CategoriesMapper.mapToCategoriesDto(categoriesRepository.save(categoryUpdate));
    }

    @Override
    public CategoriesDto getCategoryId(Integer idCategory) {
        Category category = categoriesRepository.findById(idCategory)
                .orElseThrow(() -> new ResourceNotFoundException("Categoria no existe con id: " + idCategory));

        return CategoriesMapper.mapToCategoriesDto(category);
    }

    @Override
    public List<CategoriesDto> getAllCategory() {
        return categoriesRepository.findAll()
                .stream().map((category -> CategoriesMapper.mapToCategoriesDto(category)))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCategory(CategoriesDto categoriesDto) {
        categoriesRepository.findById(categoriesDto.getIdCategories())
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Categoria no encontra con id: "
                                        + categoriesDto.getIdCategories())
                );

        categoriesRepository.deleteById(categoriesDto.getIdCategories());
    }
}
