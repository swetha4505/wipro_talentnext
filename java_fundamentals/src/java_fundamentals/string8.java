package java_fundamentals;

import java.util.*;

public class string8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*' || (i > 0 && s.charAt(i - 1) == '*')
					|| (i < s.length() - 1 && s.charAt(i + 1) == '*')) {
				continue;
			}
			result.append(s.charAt(i));
		}

		System.out.println(result.toString());
		sc.close();

	}

}
