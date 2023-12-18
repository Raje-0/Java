package questions;

public class R9_firstoccurance {
	public static int firstoccurance(int[] arr, int target, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == target) {
			return i;
		}

		return firstoccurance(arr, target, i + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 4, 74, 3, 7, 4, 3, 3, 63, 36, 22 };

		System.out.println(firstoccurance(arr, 7, 0));
	}

}
