package com.showassignment.mvc.service;
/*
 * THIS IS THE SERVICE LAYER
 */
import org.springframework.stereotype.Service;

import com.showassignment.mvc.models.Book;
import com.showassignment.mvc.repositories.BookRepository;

@Service
public class BookService {
	
	// connect this to the repository. 
	
	//Import BookRepository and give it a name.
	private BookRepository bRepo;
	//create a constructor
	// This is dependency injection. Being passed an object to be consumed.
	//When the object is constructed it will consume a repository
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	//all methods are public in the service layer. 
	
	//give us a book, with a provided Id.
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	//create a book
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	
	//define custom methods.
	//public Book findAll() {
		//find all books method.
	//}
}
