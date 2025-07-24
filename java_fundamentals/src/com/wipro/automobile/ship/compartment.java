package com.wipro.automobile.ship;

public class compartment {
	private double height;
    private double width;
    private double breadth;

    // Constructor
    public compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getter Methods
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return height * width * breadth;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Compartment Dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
        System.out.println("Volume: " + calculateVolume());
    }
}

