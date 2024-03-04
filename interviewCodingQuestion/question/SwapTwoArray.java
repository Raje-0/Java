package question;

import java.util.Arrays;

public class SwapTwoArray {
	public static void swap(int a[], int b[]) {
		System.out.println("Before swapping:");
		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));

		// Swapping logic
		int[] tempArray = a;
		a = b;
		b = tempArray;

		System.out.println("After swapping:");
		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));
	}

	public static void main(String[] args) {

		int a[] = { 11, 12, 13, 14 };
		int b[] = { 15, 16, 17, 18 };
		swap(a, b);
	}

}
