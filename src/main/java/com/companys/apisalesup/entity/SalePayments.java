package com.companys.apisalesup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "sale_payments")
public class SalePayments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSalePayment;

    @Column(name = "sale_id")
    private Integer idSale;

    @Column(name = "payment_method_id")
    private Integer idPaymentMethod;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "amount_change")
    private Double amountChange;

    @Column(name = "perquisite")
    private Double perquisite;

}
