package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SalesDto;

import java.util.List;

public interface SaleService {

    SalesDto saveSales(SalesDto salesDto);
    List<SalesDto> searchSales();
    void deleteSale(Integer idSale);

}
