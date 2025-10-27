package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.FilterProduct;
import com.companys.apisalesup.dto.ProductsDto;
import com.companys.apisalesup.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductsService productsService;

    @GetMapping(value = "/saveproduct")
    public ResponseEntity<ProductsDto> createProduct(@RequestBody ProductsDto createProduct) {
        ProductsDto productsDto = productsService.createProducts(createProduct);
        return new ResponseEntity<>(productsDto, HttpStatus.CREATED);
    }

    @GetMapping(value = "/findAllProduct")
    public ResponseEntity<List<ProductsDto>> findAllProduct() {
        return ResponseEntity.ok(productsService.allProducts());
    }

    @GetMapping(value = "/searchProduct")
    public ResponseEntity<List<ProductsDto>> searchProduct(@RequestBody FilterProduct filterProduct) {
        return ResponseEntity.ok(productsService.searchProduct(filterProduct));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(@RequestParam Integer idProduct) {
        productsService.deleteProducts(idProduct);
        return ResponseEntity.ok("Eliminado Correctamente.");
    }
}
