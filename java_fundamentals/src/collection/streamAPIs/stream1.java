package collection.streamAPIs;

import java.util.*;
import java.util.stream.Collectors;

public class stream1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, -1, -2, -3));
		ArrayList<Integer> negativeNums = numbers.stream().filter(n -> n < 0 && n % 2 == 0)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Numbers -- " + numbers);
		System.out.println("Negative Even Numbers -- " + negativeNums);

	}

}