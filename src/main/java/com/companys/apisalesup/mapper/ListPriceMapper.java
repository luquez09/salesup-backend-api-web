package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.ListPriceDto;
import com.companys.apisalesup.entity.ListPrice;

public class ListPriceMapper {

    public static ListPrice mapToListPrice(ListPriceDto listPriceDto) {
        return new ListPrice(
                listPriceDto.getIdPriceList(),
                listPriceDto.getIdProduct(),
                listPriceDto.getPrice(),
                listPriceDto.getDateCreate()
        );
    }

    public static ListPriceDto mapToListPriceDto(ListPrice listPrice) {
        return new ListPriceDto(
                listPrice.getIdPriceList(),
                listPrice.getIdProduct(),
                listPrice.getPrice(),
                listPrice.getDateCreate()
        );
    }
}
