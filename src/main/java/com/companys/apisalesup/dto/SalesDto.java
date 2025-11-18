package com.companys.apisalesup.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalesDto {

    private Integer idSales;
    private Integer idTable;
    private Integer totalArticle;
    private Double totalSale;
    private Double additional;
    private String invoiceNumber;
    private String sellerName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime saleDate;
    private Boolean active;
}
