package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.CategoriesDto;
import com.companys.apisalesup.entity.Category;

public class CategoriesMapper {

    public static CategoriesDto mapToCategoriesDto(Category category) {
        return new CategoriesDto(
                category.getIdCategories(),
                category.getNameCategories(),
                category.getDescriptionCategories()
        );
    }

    public static  Category mapToCategory(CategoriesDto categoriesDto){
        return new Category(
                categoriesDto.getIdCategories(),
                categoriesDto.getNameCategories(),
                categoriesDto.getDescriptionCategories()
        );
    }
}
