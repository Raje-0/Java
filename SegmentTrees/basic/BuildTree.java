package basic;

public class BuildTree {
	static int[] tree;
	int n;

	public BuildTree(int[] arr) {
		n = arr.length;
		tree = new int[4 * n];
		buildTree(arr, 0, 0, n - 1);
	}

	public static int buildTree(int[] arr, int i, int start, int end) {
		if (start == end) {
			tree[i] = arr[start];
			return arr[start];
		}
		int mid = start + (end - start) / 2;
		buildTree(arr, 2 * i + 1, start, mid);
		buildTree(arr, 2 * i + 2, mid + 1, end);
		tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
		return arr[start];

	}

	public int getSum(int left, int right) {
		return getSumUtil(0, 0, n - 1, left, right);
	}

	private int getSumUtil(int i, int start, int end, int left, int right) {
		if (left <= start && right >= end) {
			return tree[i];
		}
		if (end < left || start > right) {
			return 0;
		}
		int mid = start + (end - start) / 2;
		return getSumUtil(2 * i + 1, start, mid, left, right) + getSumUtil(2 * i + 2, mid + 1, end, left, right);
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		BuildTree segmentTree = new BuildTree(inputArray);

		System.out.println("Segment Tree:");
		for (int i = 0; i < segmentTree.tree.length; i++) {
			System.out.print(segmentTree.tree[i] + " ");
		}

		int sum = segmentTree.getSum(1, 4);
		System.out.println("\n\nSum of elements in the given range: " + sum);
	}
}
