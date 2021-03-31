package com.showassignment.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.showassignment.mvc.service.BookService;

@Controller
public class BookController {
	//
	private BookService bService;
	public BookController(BookService service) {
		this.bService = service;
	}
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable Long id, Model model) {
		model.addAttribute("book", this.bService.getOneBook(id));
		return "book.jsp";
	}
	
}
