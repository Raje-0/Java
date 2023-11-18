package arrayQuestion;

/*A sub array is a contiguous part of array. An array that is inside another array.
For example, consider the array [1, 2, 3, 4], There are 10 non-empty sub-arrays.
The sub arrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).*/

public class A1_SubArray {
	public static void subArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = i; j < arr.length; j++) {
				int end = j;
				for (int k = start; k < end; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		subArray(arr);
	}

}
