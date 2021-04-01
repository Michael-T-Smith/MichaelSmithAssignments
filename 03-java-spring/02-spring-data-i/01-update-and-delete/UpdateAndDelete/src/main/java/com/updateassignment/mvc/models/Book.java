package com.updateassignment.mvc.models;
/* 
       THIS IS THE DOMAIN MODEL
       a template for a book to be
       used.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Entity - base model for MySQL objects. (Table info)
@Entity
//@Table establishes table and adds the name of the table.
@Table(name="books")
public class Book {
	//Primary key for MySQL (MySQL uses primary keys (id) as a unique identifier
	@Id
	//auto increment value
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	// title of book
	private String title;
	// description of book
	private String description;
	//language of book
	private String language;
	// pages in book
	private Integer numberOfPages;
	
	
	// The makings of a java bean. public Getters setters and empty constructors.
	
	public Book() {
		
	}
	
	public Book(String title, String desc, String lang, int pages) {
		this.title = title;
		this.description = desc; 
		this.language = lang;
		this.numberOfPages = pages;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String author) {
		this.description = author;
	}
	
	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
 