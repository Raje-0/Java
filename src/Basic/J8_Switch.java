package Basic;

import java.util.Scanner;

public class J8_Switch {

	public static void main(String[] args) {
	
		System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        
        switch (a) {
		case 1: {
			System.out.println("one");
		}
		case 2: {
			System.out.println("two");
		}
		default:
			System.out.println("no match");
			
		}
	}

}
