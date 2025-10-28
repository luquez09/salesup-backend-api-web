package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.ListPriceDto;
import com.companys.apisalesup.entity.ListPrice;
import com.companys.apisalesup.mapper.ListPriceMapper;
import com.companys.apisalesup.repository.ListPriceRepository;
import com.companys.apisalesup.service.ListPriceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListPriceServiceImp implements ListPriceService {

    private final ListPriceRepository listPriceRepository;

    @Override
    public ListPriceDto saveListPrice(ListPriceDto listPriceDto) {
        return ListPriceMapper.mapToListPriceDto(
                listPriceRepository.save(ListPriceMapper.mapToListPrice(listPriceDto)));
    }

    @Override
    public List<ListPriceDto> geListPriceProduct(Integer idProductList) {
        List<ListPrice> listPrices = listPriceRepository.findAllProductsWithPrices(idProductList);
        return listPrices.stream().map((ListPriceMapper::mapToListPriceDto)).toList();
    }

    @Override
    public void deleteListPrice(Integer idProductList) {
        listPriceRepository.deleteById(idProductList);
    }
}
