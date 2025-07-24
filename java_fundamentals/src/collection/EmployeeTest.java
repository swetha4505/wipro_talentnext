package collection;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeDB db = new EmployeeDB();

		Employee e1 = new Employee(101, "Swetha", "swetha@gmail.com", "Female", 50000);
		Employee e2 = new Employee(102, "janu", "janu@gmail.com", "Female", 60000);
		Employee e3 = new Employee(103, "Anju", "anjali@gmail.com", "Female", 55000);

		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);

		System.out.println("---- All Employees ----");
		db.printAllEmployees();

		System.out.println(db.showPaySlip(102));

		if (db.deleteEmployee(103)) {
			System.out.println("Employee 103 deleted successfully.");
		} else {
			System.out.println("Employee 103 not found.");
		}

		System.out.println("---- Updated Employees ----");
		db.printAllEmployees();
	}
}
