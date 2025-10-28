package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.ProductHistoryDto;
import com.companys.apisalesup.dto.ProductsDto;
import com.companys.apisalesup.entity.ProductHistory;

public class HistoryProductMapper {

    public static ProductHistory mapToProductHistory(ProductHistoryDto productHistory) {
        return new ProductHistory(
                productHistory.getIdProductHistory(),
                productHistory.getIdProduct(),
                productHistory.getOldPrice(),
                productHistory.getNewPrice(),
                productHistory.getChangeDate()
        );
    }

    public static ProductHistoryDto mapToProductHistoryDto(ProductHistory productHistory) {
        return new ProductHistoryDto(
                productHistory.getIdProductHistory(),
                productHistory.getIdProduct(),
                productHistory.getOldPrice(),
                productHistory.getNewPrice(),
                productHistory.getChangeDate()
        );
    }
}
