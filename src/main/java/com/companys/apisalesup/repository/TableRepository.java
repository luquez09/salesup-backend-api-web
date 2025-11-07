package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Tables, Integer> {
}
