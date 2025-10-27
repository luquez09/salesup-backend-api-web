package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.FilterProduct;
import com.companys.apisalesup.dto.ProductsDto;
import com.companys.apisalesup.entity.Products;
import com.companys.apisalesup.mapper.ProductsMapper;
import com.companys.apisalesup.repository.ProductsRepository;
import com.companys.apisalesup.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductsService {

    private ProductsRepository productsRepository;

    @Override
    public ProductsDto createProducts(ProductsDto productsDto) {
        Products productsSave = productsRepository.save(
                ProductsMapper.mapToProduct(productsDto));

        return ProductsMapper.mapToProductDto(productsSave);
    }

    @Override
    public List<ProductsDto> allProducts() {
        return productsRepository.findAll().stream()
                .map((products -> ProductsMapper.mapToProductDto(products)))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductsDto> searchProduct(FilterProduct filterProduct) {
        return productsRepository.findByOptionalFilters(
                        filterProduct.getNameProduct(),
                        filterProduct.getCodeProduct(),
                        filterProduct.getAvailableProduct())
                .stream().map((products -> ProductsMapper.mapToProductDto(products)))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteProducts(Integer idProduct) {
        productsRepository.deleteById(idProduct);
    }
}
