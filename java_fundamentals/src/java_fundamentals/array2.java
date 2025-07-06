package java_fundamentals;

import java.util.*;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}sc.close();
		int max = a[0];
		int min = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}

}
