package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.TablesDto;
import com.companys.apisalesup.entity.Tables;

public class TablesMapper {

    public static Tables mapTablesMapper(TablesDto tablesDto) {
        return new Tables(
            tablesDto.getIdTable(),
            tablesDto.getNumberTable(),
            tablesDto.getAvailableTable()
        );
    }

    public static TablesDto mapTablesMapperDto(Tables tablesDto) {
        return new TablesDto(
                tablesDto.getIdTable(),
                tablesDto.getNumberTable(),
                tablesDto.getAvailableTable()
        );
    }
}
