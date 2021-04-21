package com.productsandcategories.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.productsandcategories.mvc.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
}
