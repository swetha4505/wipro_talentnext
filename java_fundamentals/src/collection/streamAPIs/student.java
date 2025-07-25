package collection.streamAPIs;

public class student {
	int roll;
	String name;
	int marks;

	public student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public String toString()
	{
		return roll + "-" + name + "-" + marks;
	}

}