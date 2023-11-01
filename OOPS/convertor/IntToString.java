package convertor;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		System.out.println("enter your int I will convert it into string");
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String s=String.valueOf(n);
		
		if (n==Integer.parseInt(s)) {
			System.out.println("good job");
		} else {
System.out.println("bad job");
		}

	}

}
