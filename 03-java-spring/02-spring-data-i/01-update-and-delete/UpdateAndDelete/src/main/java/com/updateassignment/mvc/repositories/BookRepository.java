package com.updateassignment.mvc.repositories;

import java.util.List;

/*
  THIS IS THE REPOSITORY
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.updateassignment.mvc.models.Book;


//annotated as a repository.
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	//comes with these by default.
	//.save(Book); => returns new book created
	//.findById(Long id); => returns book.
	
	
	/*
	 * if you need custom methods
	 * they go here and then are defined in the 
	 * service.
	 */
	
	List<Book> findAll();
	
	List<Book> findByDescriptionContaining(String search); 
	
	List<Book> countByTitleContaining(String search);
	
	List<Book> deleteByTitleStartingWith(String search);
	
	public void deleteById(Long id);
}

