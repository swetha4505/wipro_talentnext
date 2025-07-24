package collection;

import java.util.*;

public class List7 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Swetha", "swetha@gmail.com", "Female", 10000);
		Employee emp2 = new Employee(101, "janu", "janu@gmail.com", "Female", 15000);
		Vector<Employee> v = new Vector<>();
		v.add(emp1);
		v.add(emp2);
		System.out.println("Using Iterator");
		Iterator<Employee> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("Using Enumeration");
		Enumeration<Employee> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
	}

}