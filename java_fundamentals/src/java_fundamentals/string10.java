package java_fundamentals;

import java.util.*;

public class string10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		if (n < 0 || n > s.length()) {
			System.out.println(s.length());
		} else {
			String end = s.substring(s.length() - n);
			String result = end.repeat(n);
			System.out.println(result);
		}

		sc.close();

	}

}
