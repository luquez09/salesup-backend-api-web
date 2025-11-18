package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.SaleDetailDto;
import com.companys.apisalesup.service.SaleDetailService;
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
@RequestMapping("/api/v1/detailsales")
public class SaleDetailsController {

    private SaleDetailService saleDetailService;

    @PostMapping("/savedetail")
    public ResponseEntity<SaleDetailDto> saveAndUpdate(@RequestBody SaleDetailDto saleDetailDto) {
        return new ResponseEntity<>(saleDetailService.saveSaleDetail(saleDetailDto), HttpStatus.CREATED);
    }

    @GetMapping("/searchdetail")
    public ResponseEntity<List<SaleDetailDto>> searchSaleDetail() {
        return ResponseEntity.ok(saleDetailService.searchSalePayments());
    }

    @GetMapping("/searchdetailsale")
    public ResponseEntity<List<SaleDetailDto>> searchSaleDetailIdSale(@RequestParam Integer idSale) {
        return ResponseEntity.ok(saleDetailService.searchSalePayments(idSale));
    }

    @DeleteMapping("/deletedetail")
    public ResponseEntity<String> deleteSaleDetail(@RequestParam Integer idSaleDetail) {
        saleDetailService.deleteSalDetail(idSaleDetail);
        return ResponseEntity.ok("Producto Eliminado de la lista.");
    }
}
