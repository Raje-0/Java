package string;

import java.util.Arrays;

//Two strings, a and b , are called anagrams if they contain all the same characters in the same frequencies.ex- ram and mar


public class S5_Anagram {

	public static void main(String[] args) {
		String x ="ram";
		String y = "mar";
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result =Arrays.equals(a, b);
		if (result==true) {
			System.out.println("a and b are Anagram");
		} else {
System.out.println("they are not anagram");
		}
		

	}

}
