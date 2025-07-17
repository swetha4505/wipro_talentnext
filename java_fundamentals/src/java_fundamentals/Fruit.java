package java_fundamentals;

public class Fruit {
	String name;
	String taste;
	String size;

	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public void eat() {
		System.out.println("This is a " + name + " and it tastes " + taste + ".");
	}
}