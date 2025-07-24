package com.automobile.twowheeler;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

@SuppressWarnings("unused")
public class Test_class {
    public static void main(String[] args) {
        Hero heroBike = new Hero();
        Honda hondaBike = new Honda();

        System.out.println("=== Hero Vehicle Details ===");
        System.out.println("Model Name: " + heroBike.getModelName());
        System.out.println("Registration Number: " + heroBike.getRegistrationNumber());
        System.out.println("Owner Name: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println("\n=== Honda Vehicle Details ===");
        System.out.println("Model Name: " + hondaBike.getModelName());
        System.out.println("Registration Number: " + hondaBike.getRegistrationNumber());
        System.out.println("Owner Name: " + hondaBike.getOwnerName());
        System.out.println("Speed: " + hondaBike.getSpeed() + " km/h");
        hondaBike.cdplayer();
    }
}
