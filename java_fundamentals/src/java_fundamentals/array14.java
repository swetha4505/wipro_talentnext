package java_fundamentals;

import java.util.*;

public class array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int[] flat = new int[9];
		while (true) {
			String line = sc.nextLine().trim();
			String[] parts = line.split("\\s+");

			if (parts.length != 9) {
				System.out.println("You must enter exactly 9 integers.");
				continue;
			}
			boolean valid = true;
			for (int i = 0; i < 9; i++) {
				try {
					flat[i] = Integer.parseInt(parts[i]);
				} catch (NumberFormatException e) {
					System.out.println("Error: Invalid number '" + parts[i] + "'");
					valid = false;
					break;
				}
			}

			if (valid)
				break;
		}
		sc.close();
		int max = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = flat[index++];
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("The given array is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The biggest number in the given array is " + max);
	}

}
