package collection.streamAPIs;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class stream2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(123, "Swetha", 21, "kadapa"));
		list.add(new Employee(456, "Bhagya", 21, "kurnool"));
		list.add(new Employee(789, "janu", 25, "chittoor"));
		list.add(new Employee(112, "anju", 24, "chittoor"));
		list.add(new Employee(113, "brundha", 26, "chittoor"));
		ArrayList<Employee> location = list.stream().filter(emp -> emp.location.equals("chittoor"))
				.collect(Collectors.toCollection(ArrayList::new));

		location.forEach(System.out::println);
	}

}