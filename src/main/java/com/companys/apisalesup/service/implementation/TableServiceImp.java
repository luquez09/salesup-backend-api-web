package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.TablesDto;
import com.companys.apisalesup.mapper.TablesMapper;
import com.companys.apisalesup.repository.TableRepository;
import com.companys.apisalesup.service.TableService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class TableServiceImp implements TableService {

    private TableRepository tableRepository;

    @Override
    public TablesDto saveTable(TablesDto tablesDto) {
        return TablesMapper.mapTablesMapperDto(
                tableRepository.save(TablesMapper.mapTablesMapper(tablesDto)));
    }

    @Override
    public List<TablesDto> searchTables() {
        return tableRepository.findAll().stream().map(TablesMapper::mapTablesMapperDto).toList();
    }

    @Override
    public void deleteTable(Integer idTable) {
        tableRepository.deleteById(idTable);
    }
}
