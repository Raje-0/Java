package j4_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*in Java, a Predicate is a functional interface introduced in Java 8. 
 * It represents a boolean-valued function of one argument, commonly 
 * used for evaluating conditions on a single value. Key features 
 * include being a functional interface with the test method, and providing 
 * default and static methods for combining or modifying predicates. Predicates 
 * are often used in functional programming and with the Stream API to filter 
 * elements based on specified conditions.*/
public class PredicateExample {

	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Example 1: Using a Predicate to filter even numbers
		System.out.println("Even numbers:");
		filterAndPrint(numbers, n -> n % 2 == 0);

		// Example 2: Using a Predicate to filter numbers greater than 5
		System.out.println("\nNumbers greater than 5:");
		filterAndPrint(numbers, n -> n > 5);

		// Example 3: Combining Predicates with 'and' and 'or'
		System.out.println("\nNumbers greater than 3 and even:");
		Predicate<Integer> greaterThan3 = n -> n > 3;
		Predicate<Integer> isEven = n -> n % 2 == 0;
		filterAndPrint(numbers, greaterThan3.and(isEven));

		// Example 4: Negating a Predicate with 'negate'
		System.out.println("\nNumbers NOT greater than 5:");
		filterAndPrint(numbers, greaterThan3.negate());
	}

	// Utility method to filter and print elements based on a Predicate
	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		for (Integer number : numbers) {
			if (predicate.test(number)) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}
}
