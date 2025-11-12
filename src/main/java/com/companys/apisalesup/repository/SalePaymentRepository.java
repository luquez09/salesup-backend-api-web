package com.companys.apisalesup.repository;

import com.companys.apisalesup.dto.SearchSalePayment;
import com.companys.apisalesup.entity.SalePayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface SalePaymentRepository extends JpaRepository<SalePayments, Integer> {

    @Query(value = """
            SELECT sp.id, sp.sale_id, sp.amount, sp.amount_change, sp.perquisite, pm.method
            FROM sale_paymnts sp
            INNER JOIN payment_methods pm ON sp.payment_method_id = pm.id
            WHERE (:idsale IS NULL OR sp.sale_id = :idsale)
            """, nativeQuery = true)
    List<SearchSalePayment> findSalePaymentFilter(@Param("idsale") Integer idsale);

}
