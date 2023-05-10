package dsa2_Sorting;

public class s4_Counting {
	public static void countingSort(int no[]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < no.length; i++) {
			largest = Math.max(largest, no[i]);

		}
		int count[] = new int[largest + 1];
		for (int i = 0; i < no.length; i++) {
			count[no[i]]++;
		}
		// sorting
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				no[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void print(int no[]) {
		for (int i = 0; i < no.length; i++) {
			System.out.print(no[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int no[] = { 9, 7, 6,11, 5, 4, 1, 3 };
		countingSort(no);
		print(no);
	}
}
