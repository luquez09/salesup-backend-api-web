package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SalesDto;

import java.time.LocalDate;
import java.util.List;

public interface SaleService {

    SalesDto saveSales(SalesDto salesDto);
    List<SalesDto> findSearchSales(LocalDate starDate, LocalDate endDate, String sellerName);
    List<SalesDto> findSalesTable(Integer idTable);
    void deleteSale(Integer idTable);
}
