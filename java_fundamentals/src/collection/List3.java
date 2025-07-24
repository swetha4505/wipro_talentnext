package collection;

import java.util.*;

public class List3 {

	public static void printAll(ArrayList<String> list) {
		Iterator<String> iterator = list.iterator();
		System.out.println("Elements in the ArrayList:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Swetha");
		stringList.add("Cyber Security");
		stringList.add("Portfolio");
		stringList.add("Email");
		stringList.add("Project");
		printAll(stringList);
	}
}
