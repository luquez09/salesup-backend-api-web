package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SalesDto;

import java.time.LocalDateTime;
import java.util.List;

public interface SaleService {

    SalesDto saveSales(SalesDto salesDto);
    List<SalesDto> findSearchSales(LocalDateTime starDate, String sellerName);
    List<SalesDto> findSalesTable(Integer idTable);
    void deleteSale(Integer idTable);
}
