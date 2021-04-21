package com.productsandcategories.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsandcategories.mvc.models.Category;
import com.productsandcategories.mvc.models.Product;
import com.productsandcategories.mvc.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	public Category saveCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public List<Category> getAllCategories() {
		return this.cRepo.findAll();
	}
	
	public Category find(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	public void addProdToCategory(Product product, Category category) {
		List<Product> selectedProducts = category.getProducts();
		selectedProducts.add(product);
		this.cRepo.save(category);
	}
}

