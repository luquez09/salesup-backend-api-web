package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.SalesDto;
import com.companys.apisalesup.entity.Sales;
import com.companys.apisalesup.mapper.SalesMapper;
import com.companys.apisalesup.repository.SaleRepository;
import com.companys.apisalesup.service.SaleService;

import java.time.LocalDate;
import java.util.List;

public class SaleServiceImp implements SaleService {

    private SaleRepository saleRepository;

    @Override
    public SalesDto saveSales(SalesDto salesDto) {
        return SalesMapper.toSalesMapperDto(
          saleRepository.save(SalesMapper.toSalesMapper(salesDto)));
    }

    @Override
    public List<SalesDto> findSearchSales(LocalDate starDate, LocalDate endDate, String sellerName) {
        List<Sales> salesList = saleRepository.findSalesBetweenDatesAndSeller(starDate, endDate, sellerName);
        return salesList.stream().map(SalesMapper::toSalesMapperDto).toList();
    }

    @Override
    public List<SalesDto> findSalesTable(Integer idTable) {
        List<Sales> salesList = saleRepository.findSalesTable(idTable);
        return salesList.stream().map(SalesMapper::toSalesMapperDto).toList();
    }

    @Override
    public void deleteSale(Integer idSale) {
        saleRepository.deleteById(idSale);
    }
}
