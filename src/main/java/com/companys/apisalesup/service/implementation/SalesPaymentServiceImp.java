package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.SalePaymentsDto;
import com.companys.apisalesup.dto.SearchSalePayment;
import com.companys.apisalesup.mapper.SalePaymentMapper;
import com.companys.apisalesup.repository.SalePaymentRepository;
import com.companys.apisalesup.service.SalePaymentService;

import java.util.List;
import java.util.stream.Collectors;

public class SalesPaymentServiceImp implements SalePaymentService {

    private SalePaymentRepository paymentRepository;

    @Override
    public SalePaymentsDto saveSalePayments(SalePaymentsDto salePaymentsDto) {
        return SalePaymentMapper.mapToSalePaymentDto(
                paymentRepository.save(
                        SalePaymentMapper.mapToSalePayment(salePaymentsDto)));
    }

    @Override
    public List<SearchSalePayment> searchSalePayments(Integer idSales) {
        return paymentRepository.findSalePaymentFilter(idSales);
    }

    @Override
    public void deleteSalePayments(Integer idSalePayment) {

    }
}
