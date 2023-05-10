package dsa2_Sorting;

public class S2_Selection {
	public static void selectionSort(int no[]) {
		for (int i = 0; i < no.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < no.length; j++) {
				if (no[minPos] > no[j]) {
					minPos = j;
				}
			}
			// swap
			int temp = no[minPos];
			no[minPos] = no[i];
			no[i] = temp;
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
		selectionSort(no);
		print(no);
	}
}
