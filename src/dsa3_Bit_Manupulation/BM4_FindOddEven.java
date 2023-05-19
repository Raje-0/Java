package dsa3_Bit_Manupulation;

public class BM4_FindOddEven {
	public static void oddEven(int n) {
		int bitMask = 1;
		if ((n & bitMask) == 0) {
			// even number
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
	}

	public static void main(String[] args) {
		oddEven(5);

	}

}
