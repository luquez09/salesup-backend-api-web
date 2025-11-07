package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.PaymentMethodDto;

import java.util.List;

public interface PaymentMethodService {

    PaymentMethodDto savePaymentMethod(PaymentMethodDto paymentMethodDto);
    List<PaymentMethodDto> searchAllPaymentMethod();
    void deletePaymentMethod(Integer idPayment);

}
