package collection;

import java.util.*;

public class List4 {
	public static void main(String[] args) {
		ArrayList<Number> numberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int entered = 0;
		while (entered < count) {
			System.out.print("Enter number " + (entered + 1) + ": ");

			if (sc.hasNextDouble()) {
				double num = sc.nextDouble();
				numberList.add(num);
				entered++;
			} else {
				System.out.println("Invalid input. Please enter a number.");
				sc.next();
			}
		}

		System.out.println("\n You entered the following numbers:");
		for (Number n : numberList) {
			System.out.println(n);
		}

		sc.close();
	}
}
