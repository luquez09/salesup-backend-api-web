package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.PaymentMethodDto;
import com.companys.apisalesup.mapper.PaymentMethodMapper;
import com.companys.apisalesup.repository.PaymentMethodRepository;
import com.companys.apisalesup.service.PaymentMethodService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class PaymentMethodServiceImp implements PaymentMethodService {

    private PaymentMethodRepository methodRepository;

    @Override
    public PaymentMethodDto savePaymentMethod(PaymentMethodDto paymentMethodDto) {
        return PaymentMethodMapper.mapToPaymentMethodDto(
                methodRepository.save(
                        PaymentMethodMapper.mapToPaymentMethod(paymentMethodDto)));
    }

    @Override
    public List<PaymentMethodDto> searchAllPaymentMethod() {
        return methodRepository.findAll().stream().map(PaymentMethodMapper::mapToPaymentMethodDto).toList();
    }

    @Override
    public void deletePaymentMethod(Integer idPayment) {
        methodRepository.deleteById(idPayment);
    }
}
