package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.SalePayments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalePaymentRepository extends JpaRepository<SalePayments, Integer> {
}
