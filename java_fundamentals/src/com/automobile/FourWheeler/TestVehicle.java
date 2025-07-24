package com.automobile.FourWheeler;

import com.automobile.FourWheeler.Logan;
import com.automobile.FourWheeler.Ford;

@SuppressWarnings("unused")
public class TestVehicle {
    public static void main(String[] args) {
        Logan logan = new Logan();
        Ford ford = new Ford();

        System.out.println("=== Logan Vehicle ===");
        System.out.println("Model Name: " + logan.getModelName());
        System.out.println("Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Owner Name: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("\n=== Ford Vehicle ===");
        System.out.println("Model Name: " + ford.getModelName());
        System.out.println("Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Owner Name: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed() + " km/h");
        ford.tempControl();
    }
}
