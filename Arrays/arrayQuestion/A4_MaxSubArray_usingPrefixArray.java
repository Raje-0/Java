package arrayQuestion;

public class A4_MaxSubArray_usingPrefixArray {
	public static void maxSubArrayPrefix(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[arr.length];

		prefix[0] = arr[0];

		// Calculate prefix array
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = i; j < arr.length; j++) {
				int end = j;
				currSum = 0;

				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

				if (maxSum < currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("max sum= " + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, -2, 6, -1, 3 };
		maxSubArrayPrefix(arr);
	}

}
