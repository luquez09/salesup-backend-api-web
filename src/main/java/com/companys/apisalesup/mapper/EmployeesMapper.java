package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.EmployeDto;
import com.companys.apisalesup.entity.Employee;

public class EmployeesMapper {

    public static Employee toMapperEmployee(EmployeDto employee) {
        return new Employee(
            employee.getIdEmployee(),
            employee.getNameEmployee(),
            employee.getPhoneEmployee(),
            employee.getPasswordEmployee(),
            employee.getUserEmployee(),
            employee.getIdentificationEmployee(),
            employee.getIdRole()
        );
    }

    public static EmployeDto toMapperEmployeeDto(Employee employee) {
        return new EmployeDto(
            employee.getIdEmployee(),
            employee.getNameEmployee(),
            employee.getPhoneEmployee(),
            employee.getPasswordEmployee(),
            employee.getUserEmployee(),
            employee.getIdentificationEmployee(),
            employee.getIdRole()
        );
    }
}
