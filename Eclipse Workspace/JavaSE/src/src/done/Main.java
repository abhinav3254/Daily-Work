package done;

public class Main {
	public static void main(String[] args) {
		Book[] book = new Book[5];
		book[0] = new Book(1, "TITLE1", "PERSON1", 10, "CATEGORY1");
		book[1] = new Book(1, "TITLE2", "PERSON2", 11, "CATEGORY2");
		book[2] = new Book(1, "TITLE3", "PERSON3", 12, "CATEGORY3");
		book[3] = new Book(1, "TITLE4", "PERSON4", 13, "CATEGORY4");
		book[4] = new Book(1, "TITLE5", "PERSON5", 14, "CATEGORY5");
		
		BookStore bookStore = new BookStore("ABC STORE","HYD");
		try {
			bookStore.addBook(book[0]);
			bookStore.addBook(book[1]);
			bookStore.addBook(book[2]);
			bookStore.addBook(book[3]);
			bookStore.addBook(book[4]);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		bookStore.showAllBooks();
	}
}
