package java_fundamentals;

public class Apple extends Fruit {

	public Apple() {
		super("Apple", "Sweet", "Medium");
	}

	@Override
	public void eat() {
		System.out.println("Apple is crunchy and " + taste + " in taste.");
	}
}
