package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.TablesDto;

import java.util.List;

public interface TableService {

    TablesDto saveTable(TablesDto tablesDto);
    List<TablesDto> searchTables();

}
