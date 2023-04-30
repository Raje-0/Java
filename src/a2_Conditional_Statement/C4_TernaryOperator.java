package a2_Conditional_Statement;

import java.util.Scanner;

//it is a short hand of if else
public class C4_TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		// variable = condition?statement 1:statement 2
		String result = a % 2 == 0 ? "Even" : "Odd";
		System.out.println(a + " is " + result);
	}

}
