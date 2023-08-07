package com.sir8august.onetoone;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity(name="lib")
public class Library {
	@Id
	@Column(name="l_id")
	private int id;
	@Column(name="l_name")
	private String name;
	
	@OneToMany
	@JoinColumn(name="b_id")
	List<Book> listBook;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int id, String name, List<Book> listBook) {
		super();
		this.id = id;
		this.name = name;
		this.listBook = listBook;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Book> getListBook() {
		return listBook;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", listBook=" + listBook + "]";
	}
	
}
