package question;

import java.util.Arrays;

public class SortStringCharacter {
	public static void sort(String s) {

		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		String sortedString = new String(arr);
		System.out.println("Original string: " + s);
		System.out.println("Sorted string: " + sortedString);
	}

	public static void main(String[] args) {
		String s = "prepbytes";
		sort(s);

	}

}
