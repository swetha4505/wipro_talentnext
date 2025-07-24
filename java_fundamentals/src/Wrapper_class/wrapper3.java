package Wrapper_class;

import java.util.Scanner;

public class wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer between 1 and 255: ");
		int number = sc.nextInt();
		if (number < 1 || number > 255) {
			System.out.println("Invalid input. Please enter a number between 1 and 255.");
		} else {
			String binary = Integer.toBinaryString(number);
			String paddedBinary = String.format("%8s", binary).replace(' ', '0');
			System.out.println("8-bit Binary Representation: " + paddedBinary);
		}

		sc.close();
	}
}