package java_fundamentals;

import java.util.*;

public class string9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		StringBuilder s = new StringBuilder();
		int minLen = Math.min(a.length(), b.length());
		for (int i = 0; i < minLen; i++) {
			s.append(a.charAt(i)).append(b.charAt(i));
		}
		s.append(a.substring(minLen)).append(b.substring(minLen));

		System.out.println(s.toString());

		sc.close();

	}

}
