package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.EmployeDto;

import java.util.List;

public interface EmployeeService {

    EmployeDto createEmployee(EmployeDto employeDto);
    List<EmployeDto> searchEmployees();
    void deleteEmployee(Integer idEmployee);

}
