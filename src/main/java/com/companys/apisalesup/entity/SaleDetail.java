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
@Table(name = "sale_details")
public class SaleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSaleDetail;

    @Column(name = "sale_id")
    private Integer idSale;

    @Column(name = "product_id")
    private Integer idProduct;

    @Column(name = "employee_id")
    private Integer idEmployee;

    @Column(name = "quantity_price")
    private Integer quantityPrice;

    @Column(name = "quantity_price_total")
    private Integer quantityPriceTotal;

    @Column(name = "quantity_article")
    private Integer quantityArticle;

    @Column(name = "paid")
    private Boolean paid;

}
