package com.companys.apisalesup.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductHistoryDto {

    private Integer idProductHistory;
    private Integer idProduct;
    private Double oldPrice;
    private Double newPrice;
    private Date changeDate;

}
