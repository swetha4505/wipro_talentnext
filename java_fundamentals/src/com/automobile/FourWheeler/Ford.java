package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
	public String getModelName() {
		return "Ford EcoSport";
	}

	public String getRegistrationNumber() {
		return "MH12 DR 2345";
	}

	public String getOwnerName() {
		return "Ritika Sharma";
	}

	public int speed() {
		return 150;
	}

	public int tempControl() {
		System.out.println("Ford: Temperature control activated. AC cooling set to 22°C.");
		return 22;
	}
}
