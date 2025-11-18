package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.SaleDetailDto;
import com.companys.apisalesup.mapper.SalesDetailMapper;
import com.companys.apisalesup.repository.SalesDetailRepository;
import com.companys.apisalesup.service.SaleDetailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SaleDetailServiceImp implements SaleDetailService {

    private SalesDetailRepository detailRepository;

    @Override
    public SaleDetailDto saveSaleDetail(SaleDetailDto saleDetailDto) {
        return SalesDetailMapper.mapToSaleDetailDto(
                detailRepository.save(
                        SalesDetailMapper.mapToSaleDetail(saleDetailDto)
                ));
    }

    @Override
    public List<SaleDetailDto> searchSalePayments() {
        return List.of();
    }

    @Override
    public List<SaleDetailDto> searchSalePayments(Integer idSale) {
        return detailRepository.findAllDetailForIdSales(idSale)
                .stream()
                .map(SalesDetailMapper::mapToSaleDetailDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteSalDetail(Integer idDetail) {
        detailRepository.deleteById(idDetail);
    }
}
