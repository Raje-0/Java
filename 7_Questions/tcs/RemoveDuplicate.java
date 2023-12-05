package tcs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
        // Sample array with duplicates
        Integer[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 5};

        // Use Stream to remove duplicates and collect into a List
        List<Integer> distinctList = Arrays.stream(array)
                                           .distinct()
                                           .collect(Collectors.toList());

        // Print the array without duplicates
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("List without Duplicates: " + distinctList);
    }
}
