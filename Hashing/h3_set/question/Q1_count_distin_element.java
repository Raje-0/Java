package h3_set.question;

import java.util.HashSet;
import java.util.Set;

public class Q1_count_distin_element {

	public static void main(String[] args) {
        // Sample array with duplicate elements
        Integer[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 1, 4, 9};

        // Using a Set to count distinct elements
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer element : array) {
            uniqueElements.add(element);
        }

        // Displaying the count of distinct elements
        System.out.println("Count of distinct elements: " + uniqueElements.size());
    }
}
