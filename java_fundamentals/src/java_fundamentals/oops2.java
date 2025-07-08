package java_fundamentals;

import java.util.Scanner;

public class oops2 {

	public static class Calculator {
		public static int powerInt(int num1, int num2) {
			return (int) Math.pow(num1, num2);
		}

		public static double powerDouble(double num1, int num2) {
			return Math.pow(num1, num2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("base (int): ");
		int intBase = sc.nextInt();
		System.out.print("exponent (int): ");
		int intExp = sc.nextInt();
		int result1 = Calculator.powerInt(intBase, intExp);
		System.out.println("Result of powerInt: " + result1);
		System.out.print("base (double): ");
		double doubleBase = sc.nextDouble();
		System.out.print("exponent (int): ");
		int doubleExp = sc.nextInt();
		double result2 = Calculator.powerDouble(doubleBase, doubleExp);
		System.out.println("Result of powerDouble: " + result2);
		sc.close();
	}
}
