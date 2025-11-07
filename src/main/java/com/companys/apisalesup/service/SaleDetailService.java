package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SaleDetailDto;

import java.util.List;

public interface SaleDetailService {

    SaleDetailDto saveSaleDetail(SaleDetailDto saleDetailDto);
    List<SaleDetailDto> searchSaleDetail();
    void deleteSalDetail(Integer idDetail);

}
