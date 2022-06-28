package Basic;

import java.util.Scanner;

public class J7_SelectionStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a = sc.nextInt();

		if (a == 0) {
			System.out.println("no is zero ");
		} else if (a % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("no is odd");
		}
	}
}
