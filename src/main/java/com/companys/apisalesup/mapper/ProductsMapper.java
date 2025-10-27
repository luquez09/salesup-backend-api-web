package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.ProductsDto;
import com.companys.apisalesup.entity.Products;

public class ProductsMapper {

    public static ProductsDto mapToProductDto(Products products) {
        return new ProductsDto(
                products.getIdProduct(),
                products.getNameProduct(),
                products.getPriceProduct(),
                products.getStockProduct(),
                products.getAvailableProduct(),
                products.getCodeProduct(),
                products.getCategoryId()
        );
    }

    public static Products mapToProduct(ProductsDto productsDto) {
        return new Products(
                productsDto.getIdProduct(),
                productsDto.getNameProduct(),
                productsDto.getPriceProduct(),
                productsDto.getStockProduct(),
                productsDto.getAvailableProduct(),
                productsDto.getCodeProduct(),
                productsDto.getCategoryId()
        );
    }
}
