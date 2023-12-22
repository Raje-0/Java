package basic;

public class B3_BacktrackOnArray {

	public static void backTracking(int arr[], int i, int value) {
		//base case
		if (i == arr.length) {
			printarr(arr);
			return;
		}
        //recursion
		arr[i] = value;
		backTracking(arr, i + 1, value + 1);
		//backtrack step
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
