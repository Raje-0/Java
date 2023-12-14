package knapsack;

import java.util.Arrays;

public class D3_01Knapsack_Memo {
	 static int[][] memo;

	    public static int knapsackMemoization(int[] weights, int[] values, int capacity, int n) {
	        memo = new int[n + 1][capacity + 1];
	        for (int[] row : memo) {
	            Arrays.fill(row, -1);
	        }
	        return knapsackMemoizationHelper(weights, values, capacity, n);
	    }

	    private static int knapsackMemoizationHelper(int[] weights, int[] values, int capacity, int n) {
	        if (n == 0 || capacity == 0) {
	            return 0;
	        }

	        if (memo[n][capacity] != -1) {
	            return memo[n][capacity];
	        }

	        if (weights[n - 1] > capacity) {
	            memo[n][capacity] = knapsackMemoizationHelper(weights, values, capacity, n - 1);
	        } else {
	            memo[n][capacity] = Math.max(
	                    values[n - 1] + knapsackMemoizationHelper(weights, values, capacity - weights[n - 1], n - 1),
	                    knapsackMemoizationHelper(weights, values, capacity, n - 1));
	        }

	        return memo[n][capacity];
	    }

	    public static void main(String[] args) {
	    	int[] values = { 15,14,10,45,30 };
			int[] weights = {2,5,1,3,4 };
			int capacity = 7;
			int n = values.length;

	        int result = knapsackMemoization(weights, values, capacity, n);
	        System.out.println("Maximum value (Memoization): " + result);
	    }
}
