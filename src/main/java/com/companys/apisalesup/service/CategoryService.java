package com.companys.apisalesup.service;

import com.companys.apisalesup.dto.CategoriesDto;
import java.util.List;

public interface CategoryService {

    CategoriesDto createCategory(CategoriesDto categoriesDto);
    CategoriesDto updateCategory(CategoriesDto categoriesDto);
    CategoriesDto getCategoryId(Integer idCategory);
    List<CategoriesDto> getAllCategory();
    void deleteCategory(CategoriesDto categoriesDto);

}
