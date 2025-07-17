package java_fundamentals;

public class TestShape {
    public static void main(String[] args) {
     
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        System.out.println("Circle Object:");
        c.draw();   
        c.erase();  

        System.out.println("\nTriangle Object:");
        t.draw();   
        t.erase();  

        System.out.println("\nSquare Object:");
        s.draw();   
        s.erase();  
    }
}