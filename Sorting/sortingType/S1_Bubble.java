package sortingType;

public class S1_Bubble {
	public static void bubble_sort(int no[]) {
		for (int turn = 0; turn < no.length - 1; turn++) {
			
			for (int j = 0; j < no.length - turn - 1; j++) {
				if (no[j] > no[j + 1]) {
					// swap
					int temp = no[j];
					no[j] = no[j + 1];
					no[j + 1] = temp;

				}
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
		int no[] = { 1, 5, 6, 8, 94, 6 };
		bubble_sort(no);
		print(no);
	}

}
