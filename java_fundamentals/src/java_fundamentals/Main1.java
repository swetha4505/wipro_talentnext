package java_fundamentals;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
        System.out.println("Animal Class Methods:");
        animal.eat();     
        animal.sleep();   
        Bird bird = new Bird();
        System.out.println("\nBird Class Methods:");
        bird.eat();       
        bird.sleep();     
        bird.fly(); 
	}

}
