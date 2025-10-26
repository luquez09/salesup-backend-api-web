package com.companys.apisalesup.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @Column(name = "name_product", length = 150, nullable = false)
    private String nameProduct;

    @Column(name = "price", nullable = false)
    private Double priceProduct;

    @Column(name = "stock", length = 150, nullable = false)
    private Integer stockProduct;

    @Column(name = "available")
    private Boolean availableProduct;

    @Column(name = "code")
    private String codeProduct;

    @Column(name = "category_id")
    private Integer categoryId;
}
