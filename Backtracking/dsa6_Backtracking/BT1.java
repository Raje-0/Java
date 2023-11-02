package dsa6_Backtracking;

public class BT1 {

	public static void backTracking(int arr[], int i, int value) {
		if (i == arr.length) {
			printarr(arr);
			return;
		}

		arr[i] = value;
		backTracking(arr, i + 1, value + 1);
		arr[i] = arr[i] - 2;
	}

	public static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		backTracking(arr, 0, 1);
		printarr(arr);

	}

}
