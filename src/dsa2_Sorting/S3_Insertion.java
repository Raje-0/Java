package dsa2_Sorting;

public class S3_Insertion {
	public static void insertionSort(int no[]) {
		for (int i = 1; i < no.length; i++) {
			int curr = no[i];
			int prev = i - 1;
			// finding the correct position to insert
			while (prev >= 0 && no[prev] > curr) {
				no[prev + 1] = no[prev];
				prev--;
			}
			// insertion
			no[prev + 1] = curr;
		}
	}

	public static void print(int no[]) {
		for (int i = 0; i < no.length; i++) {
			System.out.print(no[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int no[] = { 9, 7, 6, 5, 4, 1, 3 };
		insertionSort(no);
		print(no);
	}
}
