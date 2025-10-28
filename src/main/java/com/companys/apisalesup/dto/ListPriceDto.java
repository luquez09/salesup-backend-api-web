package com.companys.apisalesup.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ListPriceDto {

    private Integer idPriceList;
    private Integer idProduct;
    private Double price;
    private Date dateCreate;

}
