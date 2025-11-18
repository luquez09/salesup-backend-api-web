package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.SalesDto;
import com.companys.apisalesup.entity.Sales;

public class SalesMapper {

    public static Sales toSalesMapper(SalesDto salesdto) {
        return new Sales(
            salesdto.getIdSales(),
            salesdto.getIdTable(),
            salesdto.getTotalArticle(),
            salesdto.getTotalSale(),
            salesdto.getAdditional(),
            salesdto.getInvoiceNumber(),
            salesdto.getSellerName(),
            salesdto.getSaleDate(),
            salesdto.getActive()
        );
    }

    public static SalesDto toSalesMapperDto(Sales sales) {
        return new SalesDto(
            sales.getIdSales(),
            sales.getIdTable(),
            sales.getTotalArticle(),
            sales.getTotalSale(),
            sales.getAdditional(),
            sales.getInvoiceNumber(),
            sales.getSellerName(),
            sales.getSaleDate(),
            sales.getActive()
        );
    }


}
