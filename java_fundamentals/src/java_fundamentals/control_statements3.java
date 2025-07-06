package java_fundamentals;

import java.util.*;

public class control_statements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine().trim();
		if (s.isEmpty()) {
			System.out.println("No values");
		} else {
			String[] as = s.trim().split(" ");
			System.out.println(String.join(",", as));
		}
		sc.close();
	}
}
