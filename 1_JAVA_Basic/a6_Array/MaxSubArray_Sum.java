package a6_Array;

import java.util.*;

public class MaxSubArray_Sum {
	public static void maxSubArray_Sum(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) {
			int s = i;
			for (int j = i; j < arr.length; j++) {
				int e = j;
				currSum = 0;
				for (int k = s; k <= e; k++) {
					currSum += arr[k];
				}
				System.out.println(currSum);
				if (maxSum < currSum) {
					maxSum = currSum;
				}

			}
			System.out.println();
		}
		System.out.println("max sum ="+maxSum);
	}

	public static void main(String[] args) {
		int arr[] = { 2,4,6,8,10 };
		maxSubArray_Sum(arr);
	}

}
