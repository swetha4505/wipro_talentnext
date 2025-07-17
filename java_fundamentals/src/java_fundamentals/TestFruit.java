package java_fundamentals;

public class TestFruit {
    public static void main(String[] args) {
        // Create Apple and Orange objects
        Apple apple = new Apple();
        Orange orange = new Orange();

        // Call their eat() methods
        System.out.println("Apple:");
        apple.eat();

        System.out.println("\nOrange:");
        orange.eat();
    }
}