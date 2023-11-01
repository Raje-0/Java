package arrayQuestion;

public class MaxSubarraySum {
	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result1 = maxSubArray(nums1);
		System.out.println("Output 1: " + result1);

		int[] nums2 = { 1 };
		int result2 = maxSubArray(nums2);
		System.out.println("Output 2: " + result2);
	}
}
