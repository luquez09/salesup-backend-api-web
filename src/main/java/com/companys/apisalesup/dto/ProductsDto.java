package com.companys.apisalesup.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * ProductDto.
 * @author Ivan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDto {

    private Integer idProduct;
    private String nameProduct;
    private Double priceProduct;
    private Integer stockProduct;
    private Boolean availableProduct;
    private String codeProduct;
    private Integer categoryId;

}
