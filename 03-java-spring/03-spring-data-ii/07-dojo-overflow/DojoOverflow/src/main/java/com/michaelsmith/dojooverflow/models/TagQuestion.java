package com.michaelsmith.dojooverflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tags_questions")
public class TagQuestion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tag_id")
	private Tag tag;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="question_id")
	private Question question;

	
	
	public TagQuestion() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
