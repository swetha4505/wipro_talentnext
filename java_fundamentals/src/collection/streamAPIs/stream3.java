package collection.streamAPIs;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class stream3 {

	public static void main(String[] args) {
		ArrayList<student> list = new ArrayList<>();
		list.add(new student(111,"swetha",100));
		list.add(new student(112,"janu",90));
		list.add(new student(113,"bhagya",95));
		list.add(new student(114,"anju",90));
		list.add(new student(115,"Mahi",89));
		ArrayList<student> passed = list.stream().filter(n -> n.marks >= 50).collect(Collectors.toCollection(ArrayList::new));
		passed.forEach(System.out::println);
		System.out.println("Number of passed student: " + passed.size());
	}

}
