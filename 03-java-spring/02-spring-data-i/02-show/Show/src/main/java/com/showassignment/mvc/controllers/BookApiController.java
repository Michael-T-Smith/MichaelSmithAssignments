package com.showassignment.mvc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showassignment.mvc.models.Book;
import com.showassignment.mvc.service.BookService;


@RestController
@RequestMapping("api")
public class BookApiController {
	//Connect to service layer
	private BookService bService;
	public BookApiController(BookService service) {
		this.bService = service;
	}
	
	//See home page.
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	
	//Use path variable to connect to id
	@RequestMapping("{id}")
	public Book showBook(@PathVariable Long id) {
		return this.bService.getOneBook(id);
	}
	
	//use Service layer create method
	@PostMapping("/create") 
	public Book createBook(Book book) {
		return this.bService.createBook(book);
	}
}
