package com.companys.apisalesup.repository;

import com.companys.apisalesup.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Integer> {

}
