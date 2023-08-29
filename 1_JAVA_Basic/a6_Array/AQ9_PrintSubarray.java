package a6_Array;

public class AQ9_PrintSubarray {
	public static void printSubarray(int no[]) {
		int totatlSubarray = 0;
		for (int i = 0; i < no.length; i++) {
			int s = i;

			for (int j = i; j < no.length; j++) {
				int e = j;
				for (int k = s; k <= e; k++) {
					System.out.print(no[k] + " ");
				}
				totatlSubarray++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total subArray = " + totatlSubarray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[] = { 1, 2, 4, 5, 7 };
		printSubarray(no);
	}

}
