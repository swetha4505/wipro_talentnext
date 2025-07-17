package java_fundamentals;

public class Orange extends Fruit {

	public Orange() {
		super("Orange", "Citrusy", "Small");
	}

	@Override
	public void eat() {
		System.out.println("Orange is juicy and has a " + taste + " flavor.");
	}
}