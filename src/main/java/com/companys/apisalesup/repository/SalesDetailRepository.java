package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.SaleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalesDetailRepository extends JpaRepository<SaleDetail, Integer> {

    @Query(value = """
            SELECT * FROM sale_details sd
            WHERE (:idsale IS NULL OR sd.id = :idsale)
            """, nativeQuery = true)
    public List<SaleDetail> findAllDetailtForIdSales(
            @Param("idsale") Integer idSale);
}
