package basic;

public class R1_No_In_Decresing_Order {
	public static void printNo(int n) {
		// base
		if (n == 1) {
			System.out.println(n);
			return;

		}
        //kaam
		System.out.print(n + " ");
		
		// calling inner function
		printNo(n - 1);
	}

	public static void main(String[] args) {

		int n = 10;
		printNo(n);
	}

}
