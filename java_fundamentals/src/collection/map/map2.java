package collection.map;

import java.util.*;

public class map2 {

	public static void main(String[] args) {
		Names names = new Names();
		names.addNames("veeramreddy", "swetha");
		names.addNames("guvvala", "janu");
		System.out.println(names.checkKey("guvvala"));
		System.out.println(names.checkValue("veeramreddy"));
		names.printAll();
	}

}

class Names {
	HashMap<String, String> names = new HashMap<>();

	void addNames(String firstName, String lastName) {
		names.put(firstName, lastName);
	}

	String checkKey(String key) {
		for (String k : names.keySet()) {
			if (k.equalsIgnoreCase(key)) {
				return key + " is exists.";
			}
		}
		return key + " does not exists.";
	}

	String checkValue(String value) {
		for (String k : names.values()) {
			if (k.equalsIgnoreCase(value)) {
				return value + " is exists.";
			}
		}
		return value + " does not exists.";
	}

	void printAll() {
		for (Map.Entry<String, String> entry : names.entrySet()) {
			System.out.println("First Name: " + entry.getKey() + ", Last Name: " + entry.getValue());
		}
	}
}