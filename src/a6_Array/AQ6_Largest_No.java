package a6_Array;

public class AQ6_Largest_No {
	public static int getLargest(int no[]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < no.length; i++) {
			if (no[i] > largest) {
				largest=no[i];
			}

		}
		return largest;

	}

	public static void main(String[] args) {
		int no[] = { 5, 34, 34, 636, 65, 45645, 457754, 42 };
		System.out.println(getLargest(no));
	}

}
