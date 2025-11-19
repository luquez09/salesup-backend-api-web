package com.companys.apisalesup.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetailDto {

    private Integer idSaleDetail;
    private Integer idSale;
    private Integer idProduct;
    private Integer idEmployee;
    private Integer quantityPrice;
    private Integer quantityPriceTotal;
    private Integer quantityArticle;
    private Boolean paid;
    @DateTimeFormat()
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime registerDetail;

}
