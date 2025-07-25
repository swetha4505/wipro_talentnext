package collection.functionalInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class function3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("12321", "sis", "madam", "hi", "welcome"));
		Predicate<String> isPalindrome = word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
		ArrayList<String> palindromes = list.stream().filter(isPalindrome)
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println("Palindromes: " + palindromes);

	}

}