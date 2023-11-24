package c1_basic;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMtd {

	public static void main(String[] args) {
		// Creating an ArrayList of integers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Adding elements to the ArrayList
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		numbers.add(10);

		// Displaying the original ArrayList
		System.out.println("Original ArrayList: " + numbers);

		// Sorting the ArrayList
		Collections.sort(numbers);

		// Displaying the sorted ArrayList
		System.out.println("Sorted ArrayList: " + numbers);

		// Finding the minimum element in the ArrayList
		int minElement = Collections.min(numbers);
		System.out.println("Minimum Element: " + minElement);

		// Finding the maximum element in the ArrayList
		int maxElement = Collections.max(numbers);
		System.out.println("Maximum Element: " + maxElement);

		// Reversing the ArrayList
		Collections.reverse(numbers);

		// Displaying the reversed ArrayList
		System.out.println("Reversed ArrayList: " + numbers);

		// Shuffling the elements in the ArrayList
		Collections.shuffle(numbers);

		// Displaying the shuffled ArrayList
		System.out.println("Shuffled ArrayList: " + numbers);
	}
}
