package java_fundamentals;

public class TestEmployee {
	public static void main(String[] args) {

		employee emp = new employee("Swetha", 750000.00, 2020, "NIN12345");

		System.out.println(emp.toString());

		emp.setAnnualSalary(800000.00);
		emp.setYearStarted(2021);
		emp.setNationalInsuranceNumber("NIN67890");

		System.out.println("\nUpdated Employee Details:");
		System.out.println(emp.toString());
	}
}
