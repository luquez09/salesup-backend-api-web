package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.SalesDto;
import com.companys.apisalesup.service.SaleService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@RestController
@Log4j2
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
            @RequestParam(value = "startdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam(value = "sellerName", required = false) String sellerName) {

        return ResponseEntity.ok(saleService.findSearchSales(startDate, sellerName));
    }

    @DeleteMapping("/deletesale")
    private ResponseEntity<String> deleteSale(@RequestParam Integer idSale) {
        saleService.deleteSale(idSale);
        return ResponseEntity.ok("Venta eliminada del sistema.");
    }
}
