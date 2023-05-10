package a7_String;

import java.util.Scanner;

public class S4_Palindrome {
	 public static void main(String[] args) {
	        System.out.println("enter your string");
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	         String reverse = new StringBuilder(A).reverse().toString();
	    if (A.equals(reverse)) {
	      System.out.println("Yes");
	    }
	    else {
	      System.out.println("No");
	    }
	    }
}
