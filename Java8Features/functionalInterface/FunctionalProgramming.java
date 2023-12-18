package functionalInterface;

import java.util.List;
//functional interface is used for functional programming(steam, lambda)
public class FunctionalProgramming {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 6, 2, 3, 44, 5);
		// TODO Auto-generated method stub

		PrintOdd(numbers);
	}

	private static void PrintOdd(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 1).forEach(System.out::println);
		{

		}
	}
}
