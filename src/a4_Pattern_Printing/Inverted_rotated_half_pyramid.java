package a4_Pattern_Printing;

public class Inverted_rotated_half_pyramid {
	public static void inverted_half_pyramid(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= n - 1; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void inverted_half_pyramid_withNumber(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inverted_half_pyramid_withNumber(5);
	}

}
