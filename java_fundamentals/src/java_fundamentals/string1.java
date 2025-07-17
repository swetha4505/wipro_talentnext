package java_fundamentals;

import java.util.*;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		boolean isPalindrome = true;
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if (isPalindrome) {
			System.out.println("palindrome.");
		} else {
			System.out.println("not a palindrome.");
		}
		sc.close();
	}

}
