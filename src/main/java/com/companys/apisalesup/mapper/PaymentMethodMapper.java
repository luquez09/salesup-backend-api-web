package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.PaymentMethodDto;
import com.companys.apisalesup.entity.PaymentMethod;

public class PaymentMethodMapper {

    public static PaymentMethod mapToPaymentMethod(PaymentMethodDto paymentMethod) {
        return new PaymentMethod(
                paymentMethod.getIdPayment(),
                paymentMethod.getPaymentName()
        );
    }

    public static PaymentMethodDto mapToPaymentMethodDto(PaymentMethod paymentMethod) {
        return new PaymentMethodDto(
                paymentMethod.getIdPayment(),
                paymentMethod.getPaymentName()
        );
    }
}
