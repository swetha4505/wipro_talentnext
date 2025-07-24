package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle {
    public String getModelName() {
        return "Honda Activa 6G";
    }

    public String getRegistrationNumber() {
        return "TS07 AB 5678";
    }

    public String getOwnerName() {
        return "Veera";
    }

    public int getSpeed() {
        return 50;
    }

    public void cdplayer() {
        System.out.println("Honda: CD Player is playing your favorite album.");
    }
}
