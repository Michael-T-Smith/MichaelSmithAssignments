package com.updateassignment.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.updateassignment.mvc.models.Book;
import com.updateassignment.mvc.services.BookService;

@Controller
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	@RequestMapping("")
	public String homePage(){
		return "/books/index.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/books/new.jsp";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Validated @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable Long id, Model model) {
		model.addAttribute("book", this.bookService.getOneBook(id));
		return "book.jsp";
	}
	

	@RequestMapping("/books/editBook/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
		Book book = bookService.findBookByIndex(id);
		if (book!=null) {
			model.addAttribute("book", book);
			return "editBook.jsp";
		} else {
			return "redirect:/books";
		}
	}
	
	@PostMapping("/books/editBook/{id}")
	public String updateBook(@PathVariable("id") int id, @Validated @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "editBook.jsp";
	} else {
		bookService.updateBook(id, book);
		return "redirect:/books";
		}
	}
	
	@RequestMapping(value="/books/delete/{id}")
    public String destroyBook(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }
	
}
