package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sales, Integer> {

    @Query(value = """
        SELECT * FROM sales sl
        WHERE sl.sale_date BETWEEN :startDate AND :endDate
        AND (:sellerName IS NULL OR sl.seller_name = :sellerName)
        ORDER BY sale_date ASC
        """, nativeQuery = true)
    List<Sales> findSalesBetweenDatesAndSeller(@Param("startDate") LocalDate startDate,
                                               @Param("endDate") LocalDate endDate,
                                               @Param("sellerName") String sellerName);

    @Query(value = """
        SELECT * FROM sales sl
        WHERE sl.table_id = :idTable
        """, nativeQuery = true)
    List<Sales> findSalesTable(@Param("idTable") Integer idTable);
}
