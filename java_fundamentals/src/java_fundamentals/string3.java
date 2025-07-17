package java_fundamentals;

import java.util.*;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.length() < 2) {
			System.out.println(s);
		} else {
			String front = s.substring(0, 2);
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				result += front;
			}
			System.out.println(result);
		}sc.close();
	}

}
