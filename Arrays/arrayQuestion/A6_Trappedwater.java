package arrayQuestion;

class A6_Trappedwater {
	public static int trap(int[] height) {
		int n = height.length;

		// To store the maximum water
		// that can be stored
		int res = 0;

		// For every element of the heightay
		// except first and last element
		for (int i = 1; i < n - 1; i++) {

			// Find maximum element on its left
			int left = height[i];
			for (int j = 0; j < i; j++) {
				left = Math.max(left, height[j]);
			}

			// Find maximum element on its right
			int right = height[i];
			for (int j = i + 1; j < n; j++) {
				right = Math.max(right, height[j]);
			}

			// Update maximum water value
			res += Math.min(left, right) - height[i];
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = { 4, 2, 0, 6, 3, 2, 5 };

		System.out.println(trap(height));
	}

}
