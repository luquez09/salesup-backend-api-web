package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SalePaymentsDto;

import java.util.List;

public interface SalePaymentService {

    SalePaymentsDto saveSalePayments(SalePaymentsDto salePaymentsDto);
    List<SalePaymentsDto> searchSalePayments();
    void deleteSalePayments(Integer idSalePayment);

}
