package collection.functionalInterface;

import java.util.*;
import java.util.function.Function;

public class function1 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(123, "Swetha", 200000, "kurnool"));
		list.add(new Employee(456, "Bhagya", 200000, "kadapa"));
		list.add(new Employee(789, "janu", 25000, "kadapa"));
		list.add(new Employee(112, "Ramya", 24000, "tirupati"));
		list.add(new Employee(113, "anju", 26000, "vizag"));
		Function<Employee, String> getLocation = emp -> emp.location;
		ArrayList<String> locations = new ArrayList<>();
		for (Employee emp : list) {
			locations.add(getLocation.apply(emp));
		}
		System.out.println("Employee Locations: " + locations);

	}

}

class Employee {
	int id;
	String name;
	int salary;
	String location;

	public Employee(int id, String name, int salary, String location) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

}