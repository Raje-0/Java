package j3_SteamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamMethod {
	public static void main(String[] args) {
		// Create an ArrayList with duplicates
		List<Integer> numbersWithDuplicates = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbersWithDuplicates.add(i);
			numbersWithDuplicates.add(i); // Adding duplicates
		}

		System.out.println("Original List with Duplicates: " + numbersWithDuplicates);

		// 7. Removing duplicate numbers
		List<Integer> distinctNumbers = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
		System.out.println("List after removing duplicates: " + distinctNumbers);

		// Rest of the Stream API operations remain the same

		// 1. Filtering even numbers
		List<Integer> evenNumbers = distinctNumbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);

		// 2. Mapping each number to its square
		List<Integer> squares = distinctNumbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Squares: " + squares);

		// 3. Reducing to get the sum
		int sum = distinctNumbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum: " + sum);

		// 4. Checking if all numbers are greater than 5
		boolean allGreaterThan5 = distinctNumbers.stream().allMatch(n -> n > 5);
		System.out.println("All numbers greater than 5: " + allGreaterThan5);

		// 5. Finding the first even number
		int firstEven = distinctNumbers.stream().filter(n -> n % 2 == 0).findFirst().orElse(-1);
		System.out.println("First even number: " + firstEven);

		// 6. Combining operations: Filter, Map, and Collect
		List<String> strings = distinctNumbers.stream().filter(n -> n % 2 == 0).map(n -> "Number: " + n)
				.collect(Collectors.toList());
		System.out.println("Filtered and Mapped Strings: " + strings);
	}
}