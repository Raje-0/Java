package j4_Function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// Example 1: Using a simple Function
		Function<Integer, String> intToString = n -> "Number: " + n;
		System.out.println(intToString.apply(42)); // Output: Number: 42

		// Example 2: Chaining Functions
		Function<Integer, Integer> add = x -> x + 2;
		Function<Integer, Integer> multiply = y -> y * 3;

		// andThen() method composes two functions sequentially
		Function<Integer, Integer> addAndMultiply = add.andThen(multiply);
		System.out.println(addAndMultiply.apply(5)); // Output: (5 + 2) * 3 = 21

		// compose() method composes two functions in reverse order
		Function<Integer, Integer> multiplyAndAdd = add.compose(multiply);
		System.out.println(multiplyAndAdd.apply(5)); // Output: (5 * 3) + 2 = 17

		// Example 3: Identity Function
		Function<String, String> identityFunction = Function.identity();
		System.out.println(identityFunction.apply("Hello")); // Output: Hello

		// Example 4: Using default methods
		Function<Integer, Integer> square = n -> n * n;
		Function<Integer, Integer> doubleThenSquare = square.andThen(add);
		System.out.println(doubleThenSquare.apply(4)); // Output: (4 * 4) + 2 = 18
	}
}
