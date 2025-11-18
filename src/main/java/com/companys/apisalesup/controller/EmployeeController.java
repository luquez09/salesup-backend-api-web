package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.EmployeDto;
import com.companys.apisalesup.service.EmployeeService;
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
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeDto> createAndUpdateEmployee(@RequestBody EmployeDto employeDto) {
        return new ResponseEntity<>(employeeService.createEmployee(employeDto), HttpStatus.CREATED);
    }

    @GetMapping("/find/searchemployee")
    public ResponseEntity<List<EmployeDto>> searchAllEmployee() {
        return ResponseEntity.ok(employeeService.searchEmployees());
    }

    @DeleteMapping
    public ResponseEntity<String> deleteEmployee(@RequestParam Integer idEmployee) {
        employeeService.deleteEmployee(idEmployee);
        return ResponseEntity.ok("Empleado eliminado");
    }
}
