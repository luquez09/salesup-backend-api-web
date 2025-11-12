package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.SalePaymentsDto;
import com.companys.apisalesup.dto.SearchSalePayment;

import java.util.List;

public interface SalePaymentService {

    SalePaymentsDto saveSalePayments(SalePaymentsDto salePaymentsDto);
    List<SearchSalePayment> searchSalePayments(Integer idSales);
    void deleteSalePayments(Integer idSalePayment);

}
