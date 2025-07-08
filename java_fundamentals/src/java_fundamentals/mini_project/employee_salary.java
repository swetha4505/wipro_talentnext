package java_fundamentals.mini_project;

import java.util.*;

public class employee_salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] empNos = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String[] empNames = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
		char[] desigCodes = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String[] departments = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		int[] basics = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int[] hras = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int[] its = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		System.out.print("Enter empid: ");
		int searchId = sc.nextInt();
		sc.close();

		boolean found = false;
		for (int i = 0; i < empNos.length; i++) {
			if (empNos[i] == searchId) {
				found = true;
				String designation = "";
				int da = 0;
				switch (desigCodes[i]) {
				case 'e':
					designation = "Engineer";
					da = 20000;
					break;
				case 'c':
					designation = "Consultant";
					da = 32000;
					break;
				case 'k':
					designation = "Clerk";
					da = 12000;
					break;
				case 'r':
					designation = "Receptionist";
					da = 15000;
					break;
				case 'm':
					designation = "Manager";
					da = 40000;
					break;
				default:
					designation = "Unknown";
					da = 0;
				}
				int salary = basics[i] + hras[i] + da - its[i];
				System.out.printf("\n%-8s %-12s %-15s %-15s %s\n", "Emp No.", "Emp Name", "Department", "Designation",
						"Salary");
				System.out.printf("%-8d %-12s %-15s %-15s %d\n", empNos[i], empNames[i], departments[i], designation,
						salary);
				break;
			}
		}
		if (!found) {
			System.out.println("There is no employee with empid: " + searchId);
		}
	}
}
