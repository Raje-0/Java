package common_Question;

import java.util.Scanner;

public class Reverse_Integer {
	 public static void main(String[] args) {
		    System.out.println("enter your no");
		Scanner sc= new Scanner(System.in);
		    int n=sc.nextInt();
		    int rev=0;
		    while(n!=0){
		      rev=rev*10+n%10;
		      n=n/10;
		      }
		System.out.println(rev);
		  }
}
