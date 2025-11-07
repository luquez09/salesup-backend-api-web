package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
