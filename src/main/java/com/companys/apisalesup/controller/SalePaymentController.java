package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.SalePaymentsDto;
import com.companys.apisalesup.dto.SearchSalePayment;
import com.companys.apisalesup.service.SalePaymentService;
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
@RequestMapping("/api/v1/roles")
public class SalePaymentController {

    private SalePaymentService salePaymentService;

    @PostMapping("/savePaymentSale")
    private ResponseEntity<SalePaymentsDto> saveSalePayment(@RequestBody SalePaymentsDto salePaymentsDto) {
        return new ResponseEntity<>(salePaymentService.saveSalePayments(salePaymentsDto), HttpStatus.CREATED);
    }

    @GetMapping("/searchPaymentSale")
    private ResponseEntity<List<SearchSalePayment>> getAllSalePayment(@RequestParam Integer idPayment) {
        return ResponseEntity.ok(salePaymentService.searchSalePayments(idPayment));
    }

    @DeleteMapping("/deletePaymentSale")
    private ResponseEntity<String> deleteTable(@RequestParam Integer idPayment) {
        salePaymentService.deleteSalePayments(idPayment);
        return ResponseEntity.ok("Payment eliminada del sistema.");
    }
}
