package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.SalesDto;
import com.companys.apisalesup.service.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    private SaleService saleService;

    @PostMapping("/savesales")
    private ResponseEntity<SalesDto> saveSales(@RequestBody SalesDto salesDto) {
        return new ResponseEntity<>(saleService.saveSales(salesDto),HttpStatus.CREATED);
    }

    @GetMapping("/findsalestable")
    private ResponseEntity<List<SalesDto>> findSalesTable(@RequestParam Integer idTable) {
        return ResponseEntity.ok(saleService.findSalesTable(idTable));
    }

    @GetMapping("/findsalesdate")
    private ResponseEntity<List<SalesDto>> findSalesBetweenDatesAndSeller(
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate,
            @RequestParam String sellerName) {
        return ResponseEntity.ok(saleService.findSearchSales(startDate, endDate, sellerName));
    }

    @DeleteMapping("/deletesale")
    private ResponseEntity<String> deleteSale() {
        return ResponseEntity.ok("Venta eliminada del sistema.");
    }
}
