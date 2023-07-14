package doit;

public class Book {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPrice;
	private String bookcategory;
	public Book(int bookId, String bookTitle, String bookAuthor, String bookPrice, String bookcategory) {
		
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookcategory = bookcategory;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public String getBookcategory() {
		return bookcategory;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}
}
