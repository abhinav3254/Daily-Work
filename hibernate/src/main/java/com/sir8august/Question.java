package com.sir8august;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity(name="question")
public class Question {
	@Id
	@Column(name="q_id")
	private int id;
	@Column(name="q_name")
	private String name;
	
	@OneToMany
	@JoinColumn(name="q_id")
	List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answer=" + answer + "]";
	}
	
	
}
