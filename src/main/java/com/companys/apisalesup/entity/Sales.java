package com.companys.apisalesup.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "sales")
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime saleDate;

    @Column(name = "active")
    private Boolean active;

}
