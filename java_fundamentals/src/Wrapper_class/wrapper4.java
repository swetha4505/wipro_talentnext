package Wrapper_class;

class Employee implements Cloneable {
	private String name;
	private int id;
	private String department;

	public Employee(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not supported.");
			return null;
		}
	}

	public String toString() {
		return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + "]";
	}
}

public class wrapper4 {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Swetha", 101, "HR");
		Employee empClone = emp1.clone();

		emp1.setName("swetha reddy");
		emp1.setDepartment("Finance");

		System.out.println("Original Employee: " + emp1);
		System.out.println("Cloned Employee  : " + empClone);
	}
}
