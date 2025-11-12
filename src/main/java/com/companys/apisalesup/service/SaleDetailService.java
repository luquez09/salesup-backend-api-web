package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SaleDetailDto;

import java.util.List;

public interface SaleDetailService {

    SaleDetailDto saveSaleDetail(SaleDetailDto saleDetailDto);
    List<SaleDetailDto> searchSalePayments();

    List<SaleDetailDto> searchSalePayments(Integer idSale);

    void deleteSalDetail(Integer idDetail);

}
