package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.ProductHistoryDto;

import java.util.List;

public interface ProductHistoryService {

    ProductHistoryDto saveProductHistory(ProductHistoryDto productsDto);
    List<ProductHistoryDto> searchProductHistoryIdProduct(Integer idProduct);
    void deleteProductHistory(Integer idHistory);

}
