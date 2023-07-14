package done;


import doit.MyException;

public class BookStore {
	Book[] book = new Book[5];
	private String storeName;
	private String location;
	int ptr = 0;
	
	public BookStore(String storeName, String location) {
		this.storeName = storeName;
		this.location = location;
	}
	
	public Book[] getBook() {
		return book;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	public void setBook(Book[] book) {
		this.book = book;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void addBook(Book book1) {
		System.out.println(book.length);
		if (ptr<book.length) {
			Book book = book1;
			System.out.println("Added !!!!");
			ptr = ptr + 1;
		} else 
			throw new MyException("Book Shelf Full");
		
	}

	
	public void showAllBooks () {
		Book[] book = getBook();
		for (int i = 0;i<book.length;i++) {
			System.out.println("Book Number "+i);
			System.out.println("Book Id :- "+book[i].getBookId());
			System.out.println("Book Title"+book[i].getBookTitle());
			System.out.println("book Author"+book[i].getAuthor());
			System.out.println("Book Price"+book[i].getPrice());
			System.out.println("Book category"+book[i].getCategory());
			System.out.println("***************");
		}
	}
	
}
