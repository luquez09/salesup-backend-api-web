package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends JpaRepository <Products, Integer> {

    @Query(value = """
    SELECT * FROM Products p
    WHERE (:name IS NULL OR LOWER(p.name_product) LIKE LOWER(CONCAT('%', :name, '%')))
      AND (:code IS NULL OR p.code = :code)
      AND (:available IS NULL OR p.available = :available)
      """, nativeQuery = true)
    List<Products> findByOptionalFilters(
            @Param("name") String name,
            @Param("code") String code,
            @Param("available") Boolean available
    );

}
