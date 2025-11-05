package com.companys.apisalesup.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalePaymentsDto {

    private Integer idSalePayment;
    private Integer idSale;
    private Integer idPaymentMethod;

    private Double amount;
    private Double amountChange;
    private Double perquisite;

}
