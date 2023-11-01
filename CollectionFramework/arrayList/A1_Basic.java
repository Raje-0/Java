package arrayList;

import java.util.ArrayList;

public class A1_Basic {

	public static void main(String[] args) {
		// Creating an ArrayList of integers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Adding elements to the ArrayList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		// Accessing elements
		int firstElement = numbers.get(0); // Returns 10

		// Updating elements
		numbers.set(1, 25); // Updates element at index 1 to 25

		// Removing elements
		numbers.remove(0); // Removes element at index 0

		// Checking size
		int size = numbers.size(); // Returns 2

		// Checking if empty
		boolean isEmpty = numbers.isEmpty(); // Returns false

		// Iterating through the ArrayList
		for (int num : numbers) {
			System.out.println(num);
		}

		// Clearing the ArrayList
		numbers.clear();

		// Adding elements back
		numbers.add(5);
		numbers.add(15);

		// Checking if an element exists
		boolean contains = numbers.contains(10); // Returns false

		// Finding index of an element
		int indexOfElement = numbers.indexOf(15); // Returns 1

		// Converting ArrayList to an array
		Integer[] numArray = numbers.toArray(new Integer[0]);
	}
}
