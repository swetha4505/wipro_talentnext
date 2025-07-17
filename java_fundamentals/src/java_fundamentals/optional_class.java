package java_fundamentals;

import java.util.*;

class InvalidEmployeeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeException(String message) {
		super(message);
	}
}

class Employee {
	String name;

	public Employee(String name) {
		this.name = name;
	}
}

public class optional_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String input = sc
				.nextLine().trim();

		Employee emp = input.isEmpty() ? null : new Employee(input);

		try {
			if (emp == null) {
				extracted();
			} else {
				System.out.println(emp.name);
			}
		} catch (InvalidEmployeeException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		sc.close();

	}

	private static void extracted() throws InvalidEmployeeException {
		throw new InvalidEmployeeException("Invalid Employee");
	}

}
