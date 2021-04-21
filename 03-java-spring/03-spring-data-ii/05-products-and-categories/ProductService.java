package com.productsandcategories.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsandcategories.mvc.models.Category;
import com.productsandcategories.mvc.models.Product;
import com.productsandcategories.mvc.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pRepo;
	
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public List<Product> getAllProducts() {
		return this.pRepo.findAll();
	}
	
	public Product find(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Product> findProductsNotInCategory(Category category) {
		return this.pRepo.findByCategoriesNotContaining(category);
	}
	
	public void addCategoryToProduct(Category category, Product product) {
		List<Category> selectedCategories = product.getCategories();
		selectedCategories.add(category);
		this.pRepo.save(product);
	}
}
