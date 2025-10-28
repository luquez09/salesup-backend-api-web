package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.ListPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ListPriceRepository extends JpaRepository<ListPrice, Integer> {

    @Query(value = """
        SELECT lp.id, lp.product_id, lp.price, lp.affective_date FROM Products p
        INNER JOIN list_prices lp ON lp.product_id = p.id
        WHERE p.id = :productId
    """, nativeQuery = true)
    List<ListPrice> findAllProductsWithPrices(
            @Param("productId") Integer productId
    );

}
