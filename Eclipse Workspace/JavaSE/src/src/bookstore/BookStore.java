package bookstore;

public class BookStore {
	private String storeName;
	private String location;
	private Book[] books;
	private int index = 0;
	public BookStore(String storeName, String location, Book[] books) {
		this.storeName = storeName;
		this.location = location;
		this.books = books;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public boolean addBook(Book book) {
		if (index < books.length) {
			books[index++] = book;
			return true;
		} else {
			throw new RuntimeException("No More Books Can Be Added");
		}
	}
	
	public boolean searchBookByTitle (String title) {
		for (int i = 0;i<index;i++) {
			if (books[i].getBookTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}
	
	public void showBooksByCategory (String category) {
		for (int i = 0;i<index;i++) {
			if (books[i].equals(category)) {

				System.out.println(books[i].getBookTitle());
				System.out.println(books[i].getBookAuthor());
				System.out.println(books[i].getBookcategory());
				System.out.println(books[i].getBookPrice());
				System.out.println(books[i].getBookId());
				System.out.println("______________________________");
			}
		}
	}
	
	public void showAll () {
		for (int i = 0;i<index;i++) {
				System.out.println(books[i].getBookTitle());
				System.out.println(books[i].getBookAuthor());
				System.out.println(books[i].getBookcategory());
				System.out.println(books[i].getBookPrice());
				System.out.println(books[i].getBookId());
				System.out.println("______________________________");
		}
	}
}
