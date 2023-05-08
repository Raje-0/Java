package a6_Array;

public class AQ7_Reverse_an_Array {
	public static void reverse(int no[]) {
		int first = 0, last = no.length - 1;
		while (first < last) {
			// swap
			int temp = no[last];
			no[last] = no[first];
			no[first] = temp;

			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		int no[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(no);
		for (int i = 0; i < no.length; i++) {
			System.out.print(no[i] + " ");
		}
		System.out.println();
	}

}
