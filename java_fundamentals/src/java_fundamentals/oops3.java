package java_fundamentals;
import java.util.*;
class Author {
	public String name;
	public String email;
	public char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
class Book {
	public String name;
    public Author author;
    public double price;
    public int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public String toString() {
        return "Book Name: " + name + "\n"
             + "Author: " + author + "\n"
             + "Price: Rs. " + price + "\n"
             + "Quantity in Stock: " + qtyInStock;
    }
}

public class oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Author Details:");
        System.out.print("Name: ");
        String authorName = sc.nextLine();

        System.out.print("Email: ");
        String authorEmail = sc.nextLine();

        System.out.print("Gender (M/F): ");
        char authorGender = sc.next().charAt(0);
        sc.nextLine(); // consume newline

        Author author = new Author(authorName, authorEmail, authorGender);

        System.out.println("\nEnter Book Details:");
        System.out.print("Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Price: ");
        double bookPrice = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        int qty = sc.nextInt();

        Book book = new Book(bookName, author, bookPrice, qty);
        System.out.println("\n---Book details---");
        System.out.println(book);
        sc.close();
    }
}
