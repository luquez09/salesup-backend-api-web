package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.SalePaymentsDto;
import com.companys.apisalesup.entity.SalePayments;

public class SalePaymentMapper {

    public static SalePayments mapToSalePayment(SalePaymentsDto salePayments) {
        return new SalePayments (
                salePayments.getIdSalePayment(),
                salePayments.getIdSale(),
                salePayments.getIdPaymentMethod(),
                salePayments.getAmount(),
                salePayments.getAmountChange(),
                salePayments.getPerquisite()
        );
    }

    public static SalePaymentsDto mapToSalePaymentDto(SalePayments salePayments) {
        return new SalePaymentsDto(
                salePayments.getIdSalePayment(),
                salePayments.getIdSale(),
                salePayments.getIdPaymentMethod(),
                salePayments.getAmount(),
                salePayments.getAmountChange(),
                salePayments.getPerquisite()
        );
    }

}
