package a3_Loop;

import java.util.Scanner;

public class L1_While {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			i++;

		}
	}
}
