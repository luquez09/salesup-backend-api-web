package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.PaymentMethodDto;
import com.companys.apisalesup.service.PaymentMethodService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/paymentmethod")
public class PaymentMethod {

    private PaymentMethodService paymentMethodService;

    @PostMapping("/savetable")
    private ResponseEntity<PaymentMethodDto> saveTables(@RequestBody PaymentMethodDto paymentMethodDto) {
        return new ResponseEntity<>(paymentMethodService.savePaymentMethod(paymentMethodDto), HttpStatus.CREATED);
    }

    @GetMapping("/searchtables")
    private ResponseEntity<List<PaymentMethodDto>> getAllTables() {
        return ResponseEntity.ok(paymentMethodService.searchAllPaymentMethod());
    }

    @DeleteMapping("/deletetable")
    private ResponseEntity<String> deleteTable(@RequestParam Integer idPayment) {
        paymentMethodService.deletePaymentMethod(idPayment);
        return ResponseEntity.ok("Metodo de pago eliminada del sistema.");
    }
}
