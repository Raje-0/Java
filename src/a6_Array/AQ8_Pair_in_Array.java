package a6_Array;

public class AQ8_Pair_in_Array {
	public static void pairs(int no[]) {
		for (int i = 0; i < no.length; i++) {
			int curr = no[i];
			for (int j = i + 1; j < no.length; j++) {
				System.out.print("(" + curr + "," + no[i] + ")");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int no[] = { 1, 2, 3, 4 };
		pairs(no);
	}
}
