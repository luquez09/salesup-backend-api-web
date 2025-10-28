package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.ProductHistoryDto;
import com.companys.apisalesup.entity.ProductHistory;
import com.companys.apisalesup.service.ProductHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/history")
public class HistoryProductController {

    private ProductHistoryService historyService;

    @PostMapping
    public ResponseEntity<ProductHistoryDto> createListPrice(@RequestBody ProductHistoryDto listPriceDto) {
        return new ResponseEntity<>(historyService.saveProductHistory(listPriceDto), HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<List<ProductHistoryDto>> searchListPriceProduct(@PathVariable Integer id) {
        return ResponseEntity.ok(historyService.searchProductHistoryIdProduct(id));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteListPrice(@RequestParam Integer idListPrice) {
        historyService.deleteProductHistory(idListPrice);
        return ResponseEntity.ok("Historia eliminada de la lista.");
    }


}
