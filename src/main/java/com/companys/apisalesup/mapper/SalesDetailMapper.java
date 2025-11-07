package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.SaleDetailDto;
import com.companys.apisalesup.entity.SaleDetail;

public class SalesDetailMapper {

    public static SaleDetail mapToSaleDetail(SaleDetailDto saleDetailDto) {
        return new SaleDetail(
                saleDetailDto.getIdSaleDetail(),
                saleDetailDto.getIdSale(),
                saleDetailDto.getIdProduct(),
                saleDetailDto.getIdEmployee(),
                saleDetailDto.getQuantityPrice(),
                saleDetailDto.getQuantityPriceTotal(),
                saleDetailDto.getQuantityArticle(),
                saleDetailDto.getPaid(),
                saleDetailDto.getRegisterDetail()
        );
    }

    public static SaleDetailDto mapToSaleDetailDto(SaleDetail saleDetailDto) {
        return new SaleDetailDto(
                saleDetailDto.getIdSaleDetail(),
                saleDetailDto.getIdSale(),
                saleDetailDto.getIdProduct(),
                saleDetailDto.getIdEmployee(),
                saleDetailDto.getQuantityPrice(),
                saleDetailDto.getQuantityPriceTotal(),
                saleDetailDto.getQuantityArticle(),
                saleDetailDto.getPaid(),
                saleDetailDto.getRegisterDetail()
        );
    }

}
