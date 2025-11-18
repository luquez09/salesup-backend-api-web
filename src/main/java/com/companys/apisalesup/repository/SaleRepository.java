package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sales, Integer> {

    @Query(value = """
        SELECT * FROM sales sl
        WHERE sale_date >= COALESCE(:startDate, sale_date)
          AND seller_name = COALESCE(:sellerName, seller_name)
        """, nativeQuery = true)
    List<Sales> findSalesBetweenDatesAndSeller(@Param("startDate") LocalDateTime startDate,
                                               @Param("sellerName") String sellerName);

    @Query(value = """
        SELECT * FROM sales sl
        WHERE sl.table_id = :idTable
        """, nativeQuery = true)
    List<Sales> findSalesTable(@Param("idTable") Integer idTable);
}
