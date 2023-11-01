package basic;

public class QueryOnST {
	int[] tree;
	int n;

	public QueryOnST(int[] arr) {
		n = arr.length;
		tree = new int[4 * n];
		buildTree(arr, 0, 0, n - 1);
	}

	private void buildTree(int[] arr, int i, int si, int sj) {
		if (si == sj) {
			tree[i] = arr[si];
		} else {
			int mid = si + (sj - si) / 2;
			buildTree(arr, 2 * i + 1, si, mid);
			buildTree(arr, 2 * i + 2, mid + 1, sj);
			tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
		}
	}
	
	//sum
	
	private int getSumUtil(int i, int si, int sj, int left, int right) {
		if (left <= si && right >= sj) {   //complete overlapping
			return tree[i];
		}
		if (sj < left || si > right) {  //non overlapping
			return 0;
		}
		int mid = si + (sj - si) / 2;
		return getSumUtil(2 * i + 1, si, mid, left, right) + getSumUtil(2 * i + 2, mid + 1, sj, left, right);
	}
	public int getSum(int left, int right) {
		return getSumUtil(0, 0, n - 1, left, right);
	}

	

	//update
	
	private void updateUtil(int i, int si, int sj, int index, int diff) { // 0(logn)
		if (index > sj || index < si) {
			return;
		}
		tree[i] += diff;
		if (si != sj) { // non-leaf
			int mid = si + (sj - si) / 2;
			updateUtil(2 * i + 1, si, mid, index, diff); // left
			updateUtil(2 * i + 2, mid + 1, sj, index, diff); // right

		}
	}

	public void update(int index, int diff) {
		updateUtil(0, 0, n - 1, index, diff);
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		QueryOnST queryOnST = new QueryOnST(inputArray);

		System.out.println("Segment Tree:");
		for (int i = 0; i < queryOnST.tree.length; i++) {
			System.out.print(queryOnST.tree[i] + " ");
		}

		int sum = queryOnST.getSum(1, 4);
		System.out.println("\nSum of elements in the given range: " + sum);

		queryOnST.update(2, 10);
		System.out.println("\nSegment Tree after update:");
		for (int i = 0; i < queryOnST.tree.length; i++) {
			System.out.print(queryOnST.tree[i] + " ");
		}

		sum = queryOnST.getSum(1, 4);
		System.out.println("\nSum of elements in the updated range: " + sum);
	}
}
