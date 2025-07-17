package java_fundamentals;

import java.util.*;

public class string4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.length() % 2 == 0) {
			String firstHalf = s.substring(0, s.length() / 2);
			System.out.println(firstHalf);
		} else {
			System.out.println("Null");
		}
		sc.close();
	}

}
