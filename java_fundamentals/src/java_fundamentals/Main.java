package java_fundamentals;

public class Main {
	public static void main(String[] args) {

		author author = new author("J.K. Rowling", "jkrowling@example.com", 'F');

		book book = new book("Harry Potter", author, 499.99, 100);
		System.out.println(book.toString());
	}
}
