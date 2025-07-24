package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	public String getModelName() {
		return "Hero Splendor Plus";
	}

	public String getRegistrationNumber() {
		return "AP39 CD 1234";
	}

	public String getOwnerName() {
		return "Swetha";
	}

	public int getSpeed() {
		return 65;
	}

	public void radio() {
		System.out.println("Hero: Radio is ON. You can tune your favorite FM channel.");
	}
}