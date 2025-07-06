package java_fundamentals;

import java.util.*;

public class array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		boolean skip = false;
		for (int i = 0; i < n; i++) {
			if (a[i] == 6) {
				boolean found7 = false;
				for (int j = i + 1; j < n; j++) {
					if (a[j] == 7) {
						found7 = true;
						break;
					}
				}
				if (found7) {
					skip = true;
					continue;
				} else {
					sum += a[i];
				}
			} else if (a[i] == 7 && skip) {
				skip = false;
			} else if (!skip) {
				sum += a[i];
			}
		}
		System.out.println(sum);
	}

}
