package Basic;

import java.util.Scanner;

public class J8_TernaryOperator {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int  a = sc.nextInt();
		sc.close();
		
		
		String result = a%2==0 ? "Even" : "Odd";
		System.out.println(a +" is "+ result);
	}

}
