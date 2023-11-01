package arrayBasic;

public class LinearSearch {
	public static int linearSearch(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 78 };
		
		System.out.println(linearSearch(arr, 1));
	}

}
