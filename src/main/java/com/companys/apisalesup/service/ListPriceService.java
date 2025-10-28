package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.ListPriceDto;

import java.util.List;

public interface ListPriceService {

    ListPriceDto saveListPrice(ListPriceDto listPriceDto);
    List<ListPriceDto> geListPriceProduct(Integer idProduct);
    void deleteListPrice(Integer idProduct);

}
