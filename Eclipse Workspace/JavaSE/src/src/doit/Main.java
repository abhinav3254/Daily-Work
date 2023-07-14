package doit;

public class Main {
	public static void main(String[] args) {
		Book[] book = new Book[4];
		// int bookId, String bookTitle, String bookAuthor, String bookPrice, String bookcategory
		book[0] = new Book(1,"ONE","Name","10","rom");
		book[1] = new Book(2,"TWO","ABC","11","dog");
		book[3] = new Book(3,"TWO","DEF","12","rom");
//		book[4] = new Book(4,"THREE","GHI","13","dog");
		BookStore bookStore = new BookStore(book, "ABC", "HYD");
		try {
			bookStore.addBook(book[0]);
			bookStore.addBook(book[1]);
			bookStore.addBook(book[2]);
//			bookStore.addBook(book[3]);
			
//			System.out.println("Book Category :- "+bookStore.searchBookcategory("nor", book));
//			System.out.println("Book Title :- "+bookStore.searchBookTitle("ABC", book));
		
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		bookStore.showAllBooks();
	}
	
	public static void callME () {
		throw new MyException("Nailed it!!!!!");
	}
}
