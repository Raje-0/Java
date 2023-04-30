package a3_Loop.Question;

import java.util.Scanner;

public class Sum_of_n_natural_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();

		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("sum of n natural no is " + sum);
	}

}
