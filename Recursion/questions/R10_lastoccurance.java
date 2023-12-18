package questions;

public class R10_lastoccurance {
	public static int lastoccurance(int[] arr, int target, int i) {

		if (i == arr.length) {
			return -1;
		}
		int isFound = lastoccurance(arr, target, i + 1);
		if (isFound == -1 && arr[i] == target) {
			return i;
		}
		if (arr[i] == target) {

		}

		return isFound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 4, 74, 3, 7, 4, 3, 3, 63, 36, 22 };

		System.out.println(lastoccurance(arr, 7, 0));
	}

}
