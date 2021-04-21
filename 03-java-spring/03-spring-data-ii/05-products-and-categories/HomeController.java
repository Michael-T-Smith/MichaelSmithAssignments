package com.productsandcategories.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.productsandcategories.mvc.models.Category;
import com.productsandcategories.mvc.models.Product;
import com.productsandcategories.mvc.services.CategoryService;
import com.productsandcategories.mvc.services.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;
	
	
	//Home page
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//get form for Product
	@GetMapping("/products/newProductForm")
	public String getNewProduct(@ModelAttribute("product") Product product) {
		return "/products/newProduct.jsp";
	}
	
	//save product to MySQL
	@PostMapping("/products/newProduct")
	public String createNewProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors())
			return "/products/newProductFrom";
		this.pService.createProduct(product);
		return "redirect:/";
	}
	
	//get form for Categories
	@GetMapping("/categories/newCategoryForm")
	public String getNewCategory(@ModelAttribute("category") Category category) {
		return "/categories/newCategory.jsp";
	}
	
	//save category to MySQL
	@PostMapping("/categories/newCategory")
	public String createCategory(@Valid @ModelAttribute("category") Category category, Model viewModel, BindingResult result) {
		if(result.hasErrors())
			return "/categories/newCategory.jsp";
		this.cService.saveCategory(category);
		return"redirect:/";
	}
	
	//view products table
	@GetMapping("/products/productsTable")
	public String showProducts(Model viewModel) {
		List<Product> products = this.pService.getAllProducts();
		viewModel.addAttribute("products", products);
		return "products/productsTable.jsp";
	}
	
	//view categories table
	@GetMapping("/categories/categoriesTable")
	public String showCategories(Model viewModel) {
		List<Category> categories = this.cService.getAllCategories();
		viewModel.addAttribute("categories", categories);
		return "/categories/categoriesTable.jsp";
	}
	
	//add categories to products
	@GetMapping("/products/{id}")
	public String addCategories(@PathVariable("id") Long id, Model viewModel) {
		Product product = this.pService.find(id);
		viewModel.addAttribute("product", product);
		return "products/showProducts.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String addCategoryToProduct(@RequestParam("category") Long categoryId, @PathVariable("id") Long productId) {
		Product thisProduct = pService.find(productId);
		Category selectCategory = cService.find(categoryId);
		pService.addCategoryToProduct(selectCategory, thisProduct);
		return "redirect:/product/" + productId;
	}
	
	
	//add products to categories
	@GetMapping("/categories/{id}")
	public String addProducts(@PathVariable("id") Long id, Model viewModel) {
		Category category = this.cService.find(id);
		viewModel.addAttribute("category", category);
		return "categories/showCategories.jsp";
	}
	
	@PostMapping("/category/{id}")
	public String addProductToCategory(@RequestParam("product") Long prodId, @PathVariable("id") Long catId) {
	Category thisCategory = cService.find(catId);
	Product selectProduct = pService.find(prodId);
	cService.addProdToCategory(selectProduct, thisCategory);
	return "redirect:/category/" + catId;
}
}	
