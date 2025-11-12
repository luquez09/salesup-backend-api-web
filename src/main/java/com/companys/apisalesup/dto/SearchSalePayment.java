package com.companys.apisalesup.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchSalePayment {

    @Id
    private Integer idSalePayment;
    @Column(name = "sale_id")
    private Integer idSale;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "amount_change")
    private Double amount_change;
    @Column(name = "perquisite")
    private Double perquisite;
    @Column(name = "method")
    private String method;

}
