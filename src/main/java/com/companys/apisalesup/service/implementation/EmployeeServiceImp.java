package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.EmployeDto;
import com.companys.apisalesup.entity.Employee;
import com.companys.apisalesup.mapper.EmployeesMapper;
import com.companys.apisalesup.repository.EmployeeRepository;
import com.companys.apisalesup.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeDto createEmployee(EmployeDto employeDto) {
        Employee employee = employeeRepository
                .save(EmployeesMapper
                .toMapperEmployee(employeDto));
        return EmployeesMapper.toMapperEmployeeDto(employee);
    }

    @Override
    public List<EmployeDto> searchEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(EmployeesMapper::toMapperEmployeeDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmployee(Integer idEmployee) {
        employeeRepository.deleteById(idEmployee);
    }
}
