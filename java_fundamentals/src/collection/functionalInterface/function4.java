package collection.functionalInterface;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class function4 {

	public static void main(String[] args) {
		ArrayList<EmployeeData> list = new ArrayList<>();
		list.add(new EmployeeData(111, "Swetha", 12500));
		list.add(new EmployeeData(112, "janu", 1200));
		list.add(new EmployeeData(113, "Sindhu", 9500));
		list.add(new EmployeeData(114, "Priya", 1100));
		list.add(new EmployeeData(115, "Ramya", 8500));
		Predicate<EmployeeData> getSalaries = sal -> sal.getSalary() < 10000;
		ArrayList<String> names = list.stream().filter(getSalaries).map(EmployeeData::getName)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Persons with salaries less than 10000: " + names);
		}
	}