package com.michaelsmith.lookify.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="lookify")
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=5, max=255)
	private String title;
	
	@Size(min=5, max=255)
	private String artist;
	
	@Min(1)
	@Max(10)
	@NotNull
	private int rating;

	//Constructors
	public Song() {
		
	}
	
	public Song(@Size(min = 5, max=255) String title, @Size(min = 5, max=255) String artist,
			@Size(min = 1, max = 10) @NotNull int rating) {
		super();
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}


	//Getters & Setters
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

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
