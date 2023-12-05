package arrayBasic;

public class A3_ReverseArray {
	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// Swap the elements at start and end positions
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			// Move the pointers towards the center of the array
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverse(arr);

		// Print the reversed array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	
}
