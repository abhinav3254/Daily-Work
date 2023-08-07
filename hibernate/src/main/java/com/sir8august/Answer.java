package com.sir8august;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="answer")
public class Answer {
	@Id
	@Column(name="a_id")
	private int id;
	@Column(name="a_name")
	private String ansName;
	
	@ManyToOne
	@JoinColumn(name="q_id")
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String ansName, Question question) {
		super();
		this.id = id;
		this.ansName = ansName;
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public String getAnsName() {
		return ansName;
	}

	public Question getQuestion() {
		return question;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAnsName(String ansName) {
		this.ansName = ansName;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", ansName=" + ansName + ", question=" + question + "]";
	}
}
