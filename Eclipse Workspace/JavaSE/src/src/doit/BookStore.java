package doit;


public class BookStore {
	private Book[] book;
	private String storeName;
	private String location;
	int size = 0;
	int ptr = -1;
	public BookStore(Book[] book, String storeName, String location) {
		super();
		this.book = book;
		this.storeName = storeName;
		this.location = location;
		this.size = book.length;
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
	
	public void addBook (Book book1) {
		if (ptr <= size-2) {
			ptr = ptr + 1;
			book[ptr] = book1;
			System.out.println("Added Successfully" + ptr + " ptr and size"+size);
		} else {
			// Throw Exception here
			throw new MyException("Done Error -->");
		}
	}
	
	public boolean searchBookTitle(String title,Book book1) {
		for (int i = 0;i<size;i++) {
			if (title.equals(book1.getBookTitle())) {
				return true;
			} 
		}
		return false;
	}
	
	public boolean searchBookcategory(String category,Book book1) {
		for (int i = 0;i<size;i++) {
			if (category.equals(book1.getBookcategory())) {
				return true;
			} 
		}
		return false;
	}
	
	public void showAllBooks () {
		Book[] book = getBook();
		for (int i = 0;i<size;i++) {
			System.out.println("Book Number "+i);
			System.out.println("Book Id :- "+book[i].getBookId());
			System.out.println("Book Title"+book[i].getBookTitle());
			System.out.println("book Author"+book[i].getBookAuthor());
			System.out.println("Book Price"+book[i].getBookPrice());
			System.out.println("Book category"+book[i].getBookcategory());
			System.out.println("***************8");
		}
	}
	
}
