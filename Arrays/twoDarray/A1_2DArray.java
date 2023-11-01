package twoDarray;

import java.util.Scanner;

public class A1_2DArray {
	public static void main(String[] args) {
		int twoD[][] = new int[3][3];
		int n = twoD.length;
		int m = twoD[0].length;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				twoD[i][j] = sc.nextInt();
			}

		}
		// out put
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println(twoD[i][j] + " ");

			}
			System.out.println();
		}

	}
}
