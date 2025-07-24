package collection;

import java.util.*;

public class EmployeeDB {
	private ArrayList<Employee> list = new ArrayList<>();

	public boolean addEmployee(Employee e) {
		return list.add(e);
	}

	public boolean deleteEmployee(int empId) {
		for (Employee e : list) {
			if (e.getEmpId() == empId) {
				list.remove(e);
				return true;
			}
		}
		return false;
	}

	public String showPaySlip(int empId) {
		for (Employee e : list) {
			if (e.getEmpId() == empId) {
				return "Pay slip for employee ID " + empId + " is ₹" + e.getSalary();
			}
		}
		return "Employee not found";
	}

	public void printAllEmployees() {
		for (Employee e : list) {
			e.getEmployeeDetails();
		}
	}
}
