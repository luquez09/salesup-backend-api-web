package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.ProductHistoryDto;
import com.companys.apisalesup.entity.ProductHistory;

public class ProductHistoryMapper {

    public static ProductHistory mapToProductHistory(ProductHistoryDto historyDto) {
        return new ProductHistory (
                historyDto.getIdProductHistory(),
                historyDto.getIdProduct(),
                historyDto.getOldPrice(),
                historyDto.getNewPrice(),
                historyDto.getChangeDate()
        );
    }

    public static ProductHistoryDto mapToProductHistoryDto(ProductHistory historyDto) {
        return new ProductHistoryDto (
                historyDto.getIdProductHistory(),
                historyDto.getIdProduct(),
                historyDto.getOldPrice(),
                historyDto.getNewPrice(),
                historyDto.getChangeDate()
        );
    }

}
