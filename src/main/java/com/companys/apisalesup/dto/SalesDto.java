package com.companys.apisalesup.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalesDto {

    private Integer idSales;
    private Integer idTable;
    private Integer totalArticle;

    private Double totalSale;
    private Double additional;

    private String invoiceNumber;
    private String sellerName;
    private Date saleDate;

}
