package com.companys.apisalesup.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterProduct {
    private String codeProduct;
    private String nameProduct;
    private Boolean availableProduct;
}
