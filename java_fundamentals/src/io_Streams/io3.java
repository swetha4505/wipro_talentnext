package io_Streams;

import java.io.*;
import java.util.*;

public class io3 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: Java FileWordCount <inputFile> <outputFile>");
			return;
		}

		String inputFile = args[0];
		String outputFile = args[1];

		Map<String, Integer> wordCountMap = new TreeMap<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			String line;

			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");

				for (String word : words) {
					word = word.trim();
					if (!word.isEmpty()) {
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}

			reader.close();

			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue());
				writer.newLine();
			}

			writer.close();
			System.out.println("Word count written to: " + outputFile);
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
