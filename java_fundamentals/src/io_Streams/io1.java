package io_Streams;

import java.io.*;
import java.util.*;

public class io1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file name: ");
		String fileName = sc.nextLine();

		System.out.print("Enter the character to be counted: ");
		char targetChar = sc.nextLine().toLowerCase().charAt(0);

		int count = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			int ch;

			while ((ch = reader.read()) != -1) {
				if (Character.toLowerCase((char) ch) == targetChar) {
					count++;
				}
			}
			reader.close();
			System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
		}

		sc.close();
	}
}
