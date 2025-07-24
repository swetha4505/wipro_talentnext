package collection.set;

import java.util.*;

public class set2 {

	public static void main(String[] args) {
		HashSet<String> empNames = new HashSet<>();
		empNames.add("Swetha");
		empNames.add("janu");
		empNames.add("sri");

		Iterator<String> it = empNames.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}