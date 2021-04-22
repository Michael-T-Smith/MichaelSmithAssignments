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
import javax.persistence.Table;

@Entity
@Table(name="tags")
public class Tag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String tag;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	
	@OneToMany(mappedBy="tag", fetch = FetchType.LAZY)
	private List<TagQuestion> tagQuestion;
	
	
	public Tag() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
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


	public List<TagQuestion> getTagQuestion() {
		return tagQuestion;
	}


	public void setTagQuestion(List<TagQuestion> tagQuestion) {
		this.tagQuestion = tagQuestion;
	}
	
	
}	
