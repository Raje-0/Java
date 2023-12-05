package arrayBasic;

public class A2_BinarySearch {
	public static int binary(int arr[], int target) {
		int s = 0, e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 78 };
		System.out.println("target is at index no = "+binary(arr, 4));
	}

}
