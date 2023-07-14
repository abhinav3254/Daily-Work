package done;

public class Book {
	private int bookId;
	private String bookTitle;
	private String author;
	private int price;
	private String category;
	
	public Book(int bookId, String bookTitle, String author, int price, String category) {
		
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	public int getBookId() {
		return bookId;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
