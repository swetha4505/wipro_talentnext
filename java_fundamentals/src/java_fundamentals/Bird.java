package java_fundamentals;

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird pecks at grains");
    }
    @Override
    public void sleep() {
        System.out.println("Bird sleeps in its nest");
    }
    public void fly() {
        System.out.println("Bird flies in the sky");
    }
}
