package dsa4_Recursion;

public class No_In_Decresing_Order {
	public static void printNo(int n) {
		if (n == 1) {
			System.out.println(n);
			return;

		}

		System.out.print(n + " ");
		printNo(n - 1);
	}

	public static void main(String[] args) {

		int n = 10;
		printNo(n);
	}

}
