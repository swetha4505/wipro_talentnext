package io_Streams;

import java.io.*;
import java.util.*;

public class io2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input file name: ");
		String inputFile = sc.nextLine();

		System.out.print("Enter the output file name: ");
		String outputFile = sc.nextLine();

		try {
			FileReader fr = new FileReader(inputFile);
			FileWriter fw = new FileWriter(outputFile);

			int ch;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}

			fr.close();
			fw.close();

			System.out.println("File is copied.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + inputFile);
		} catch (IOException e) {
			System.out.println("An error occurred during file operation.");
		}

		sc.close();
	}
}
