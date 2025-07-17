package java_fundamentals;

import java.util.*;

public class stringjoiner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of cities in s1: ");
		int n1 = sc.nextInt();
		sc.nextLine();

		StringJoiner s1 = new StringJoiner(",");
		for (int i = 1; i <= n1; i++) {
			System.out.print("Enter city " + i + " for s1: ");
			String city = sc.nextLine();
			s1.add(city);
		}

		System.out.print("Enter number of cities in s2: ");
		int n2 = sc.nextInt();
		sc.nextLine();

		StringJoiner s2 = new StringJoiner(",");
		for (int i = 1; i <= n2; i++) {
			System.out.print("Enter city " + i + " for s2: ");
			String city = sc.nextLine();
			s2.add(city);
		}
		StringJoiner mergedS1ToS2 = new StringJoiner(",");
		mergedS1ToS2.merge(s1);
		mergedS1ToS2.merge(s2);
		System.out.println("s1 merged into s2: " + mergedS1ToS2);
		StringJoiner mergedS2ToS1 = new StringJoiner(",");
		mergedS2ToS1.merge(s2);
		mergedS2ToS1.merge(s1);
		System.out.println("s2 merged into s1: " + mergedS2ToS1);
		sc.close();

	}

}
