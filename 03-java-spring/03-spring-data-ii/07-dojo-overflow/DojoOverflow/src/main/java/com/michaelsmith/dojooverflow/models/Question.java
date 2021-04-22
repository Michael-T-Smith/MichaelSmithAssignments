package com.michaelsmith.dojooverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String theQuestion;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy--MM--DD HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy--MM--DD HH:mm:ss")
	private Date updatedAt;
	
	
	//TO-DO: link to tags_questions database.
	
	@OneToMany(mappedBy="question", fetch=FetchType.LAZY)
	private List<Answer> answers;
	
	@OneToMany(mappedBy="tag", fetch=FetchType.LAZY)
	private List<TagQuestion> tagQuestion;
	//constructor
	public Question() {
		
	}
	
	//getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public String getTheQuestion() {
		return theQuestion;
	}

	public void setTheQuestion(String theQuestion) {
		this.theQuestion = theQuestion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date(); 
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<TagQuestion> getTagQuestion() {
		return tagQuestion;
	}

	public void setTagQuestion(List<TagQuestion> tagQuestion) {
		this.tagQuestion = tagQuestion;
	}
	
	
}
