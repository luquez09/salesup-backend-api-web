package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.ProductHistoryDto;
import com.companys.apisalesup.dto.ProductsDto;
import com.companys.apisalesup.mapper.HistoryProductMapper;
import com.companys.apisalesup.repository.ProductHistoryRepository;
import com.companys.apisalesup.service.ProductHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductHistoryServiceImp implements ProductHistoryService {

    private  ProductHistoryRepository historyRepository;

    @Override
    public ProductHistoryDto saveProductHistory(ProductHistoryDto productsDto) {
        return HistoryProductMapper.mapToProductHistoryDto(
                historyRepository.save(HistoryProductMapper.mapToProductHistory(productsDto))
        );
    }

    @Override
    public List<ProductHistoryDto> searchProductHistoryIdProduct(Integer idProduct) {
        return historyRepository.findProductHistoriesByIdProduct(idProduct)
                .stream().map((history) -> HistoryProductMapper.mapToProductHistoryDto(history))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteProductHistory(Integer idHistory) {
        historyRepository.deleteById(idHistory);
    }
}
