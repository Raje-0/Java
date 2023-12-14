package knapsack;

//https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
public class D2_01Knapsack_recursion {
	public static int knapsackRecursive(int[] weights, int[] values, int capacity, int n) {
		// Base case
		if (n == 0 || capacity == 0) {
			return 0;
		}

		// If the weight of the nth item is more than the capacity, exclude it
		if (weights[n - 1] > capacity) {
			return knapsackRecursive(weights, values, capacity, n - 1);
		} else {
			// Return the maximum of two cases: (1) nth item included (2) nth item not
			// included
			return Math.max(values[n - 1] + knapsackRecursive(weights, values, capacity - weights[n - 1], n - 1),
					knapsackRecursive(weights, values, capacity, n - 1));
		}
	}

	public static void main(String[] args) {
		int[] values = { 15,14,10,45,30 };
		int[] weights = {2,5,1,3,4 };
		int capacity = 7;
		int n = values.length;

		int result = knapsackRecursive(weights, values, capacity, n);
		System.out.println("Maximum value (Recursion): " + result);
	}
}
