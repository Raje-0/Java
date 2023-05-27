package a4_Pattern_Printing;

import java.util.Iterator;

public class Inverted_half_piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++) {
	for(int j=1;j<=4-i+1;j++) {
		System.out.print(" * ");
	}
	System.out.println();
}
	}

}
