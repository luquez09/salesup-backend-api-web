package com.companys.apisalesup.repository;

import com.companys.apisalesup.dto.ProductHistoryDto;
import com.companys.apisalesup.entity.ProductHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductHistoryRepository extends JpaRepository <ProductHistory, Integer> {

    @Query(value = """
        SELECT * FROM product_price_history pph
        WHERE (:product_id IS NULL OR pph.product_id = :product_id)
    """, nativeQuery = true)
    List<ProductHistory>  findProductHistoriesByIdProduct(
            @Param("product_id") Integer productId
    );

}
