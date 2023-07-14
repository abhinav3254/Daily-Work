package doit;

public class Main {
	public static void main(String[] args) {
		Book[] book = new Book[4];
		book[0] = new Book(1,"ONE","Name","10","rom");
		BookStore bookStore = new BookStore(book, "ABC", "HYD");
		try {
			bookStore.addBook(book[0]);
			bookStore.addBook(book[0]);
			bookStore.addBook(book[0]);
			bookStore.addBook(book[0]);
			
		
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
//		bookStore.showAllBooks();
	}
	
	public static void callME () {
		throw new MyException("Nailed it!!!!!");
	}
}
