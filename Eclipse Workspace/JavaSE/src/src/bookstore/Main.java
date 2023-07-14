package bookstore;

public class Main {
	public static void main(String[] args) {
		BookStore bs = new BookStore("Himalaya","Abids",new Book[5]);
		// int bookId, String bookTitle, String bookAuthor, String bookPrice, String bookcategory
		bs.addBook(new Book(7001,"Let Us C","Yashwant","500","Programming"));
		bs.addBook(new Book(7002,"crime files","xyz","750","crime"));
		bs.addBook(new Book(7003,"How to C++","Dietel","1250","Programming"));
		bs.addBook(new Book(7004,"CID","abc","650","Crime"));
		bs.addBook(new Book(7005,"Ramayan","Valmeki","2500","Epic"));
		bs.addBook(new Book(7006,"CID","abc","120","Crime"));
//		bs.showAll();
//		bs.showBooksByCategory("Epic");
		System.out.println(bs.searchBookByTitle("Let Us C"));
	}
}
