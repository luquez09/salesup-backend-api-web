package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.FilterProduct;
import com.companys.apisalesup.dto.ProductsDto;
import java.util.List;

public interface ProductsService {
    ProductsDto createProducts(ProductsDto productsDto);
    List<ProductsDto> allProducts();
    List<ProductsDto> searchProduct(FilterProduct filterProduct);
    void deleteProducts(Integer idProduct);
}
