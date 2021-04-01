package com.updateassignment.mvc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * THIS IS THE SERVICE LAYER
 */
import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.model.core.ID;
import com.updateassignment.mvc.models.Book;
import com.updateassignment.mvc.repositories.BookRepository;


@Service
public class BookService {
	
	// initialize the books variable with values
	private List<Book> books = new ArrayList<Book>(Arrays.asList(
			new Book("Harry Postter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
			new Book("The Great Gatsby", "The story primarily concerns the yound and mysterious millionaire Jay Gatsby", "english", 180),
			new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
			new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
			new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
			));
	
	// connect this to the repository. 
	
	
	//Import BookRepository and give it a name.
	private BookRepository bookRepository;
	
	
	//create a constructor
	// This is dependency injection. Being passed an object to be consumed.
	//When the object is constructed it will consume a repository
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	//all methods are public in the service layer. 
	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	
	//give us a book, with a provided Id.
	public Book getOneBook(Long id) {
		return this.bookRepository.findById(id).orElse(null);
	}
	
	//create a book
	public Book createBook(Book newBook) {
		return bookRepository.save(newBook);
	}
	
	public Book findBookByIndex(int index) {
		if (index < books.size()) {
			return books.get(index);
		} else {
			return null;
		}
	}
	
	public void updateBook(int id, Book book) {
		if (id < books.size()) {
			books.set(id, book);
		}
	}
	
	public void deleteById(Long id) {
		try {
		bookRepository.deleteById(id);
	} catch(Exception e) {
		System.out.println("Error: Not a valid ID number.");
	}
	
	}	
}

