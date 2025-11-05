package com.companys.apisalesup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSales;

    @Column(name = "table_id")
    private Integer idTable;

    @Column(name = "total_article")
    private Integer totalArticle;

    @Column(name = "total_sales")
    private Double totalSale;

    @Column(name = "additional")
    private Double additional;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "sale_date")
    private Date saleDate;

}
