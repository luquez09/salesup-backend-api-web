package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.TablesDto;
import com.companys.apisalesup.service.TableService;
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
@RequestMapping("/api/v1/table")
public class TableController {

    private TableService tableService;

    @PostMapping("/savetable")
    private ResponseEntity<TablesDto> saveTables(@RequestBody TablesDto tablesDto) {
        return new ResponseEntity<>(tableService.saveTable(tablesDto), HttpStatus.CREATED);
    }

    @GetMapping("/searchtables")
    private ResponseEntity<List<TablesDto>> getAllTables() {
        return ResponseEntity.ok(tableService.searchTables());
    }

    @DeleteMapping("/deletetable")
    private ResponseEntity<String> deleteTable(@RequestParam Integer idTable) {
        tableService.deleteTable(idTable);
        return ResponseEntity.ok("Mesa eliminada del sistema.");
    }
}
