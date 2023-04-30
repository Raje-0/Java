package a1_Baisc;

import java.util.Scanner;
//it is a short hand of if else
public class J9_TernaryOPerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int  a = sc.nextInt();
		sc.close();
		
		
		String result = a%2==0 ? "Even" : "Odd";
		System.out.println(a +" is "+ result);
	}

}
