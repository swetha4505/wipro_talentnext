package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
	public String getModelName() {
		return "Logan Sedan";
	}

	public String getRegistrationNumber() {
		return "KA05 MG 9898";
	}

	public String getOwnerName() {
		return "Arjun Reddy";
	}

	public int speed() {
		return 120;
	}

	public int gps() {
		System.out.println("Logan: GPS is active. Navigation system running.");
		return 1;
	}
}
