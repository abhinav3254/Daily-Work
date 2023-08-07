package com.sir8august.onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="book")
public class Book {
	@Id
	@Column(name = "b_id")
	private int id;
	@Column(name="b_name")
	private String bookName;
	@Column(name="b_price")
	private String price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookName, String price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public String getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}
}
