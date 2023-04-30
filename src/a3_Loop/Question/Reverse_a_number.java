package a3_Loop.Question;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int rev = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			System.out.print(lastDigit + " ");
			num = num / 10;
		}
		System.out.println();
	}

}
