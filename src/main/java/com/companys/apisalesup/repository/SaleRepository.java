package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sales, Integer> {
}
