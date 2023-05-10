package a7_String;

import java.util.StringTokenizer;

public class S6_Token {

	public static void main(String[] args) {
		String s = "This is a cat";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
