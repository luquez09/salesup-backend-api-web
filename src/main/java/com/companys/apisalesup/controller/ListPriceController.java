package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.ListPriceDto;
import com.companys.apisalesup.service.ListPriceService;
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
@RequestMapping("/api/v1/listPrices")
public class ListPriceController {

    private ListPriceService listPriceService;

    @PostMapping
    public ResponseEntity<ListPriceDto> createListPrice(@RequestBody ListPriceDto listPriceDto) {
        return new ResponseEntity<>(listPriceService.saveListPrice(listPriceDto), HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<List<ListPriceDto>> searchListPriceProduct(@PathVariable Integer id) {
        return ResponseEntity.ok(listPriceService.geListPriceProduct(id));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteListPrice(@RequestParam Integer idListPrice) {
        listPriceService.deleteListPrice(idListPrice);
        return ResponseEntity.ok("Precio eliminado de la lista.");
    }
}
