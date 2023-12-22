package basic;

public class B4_SubSetOfString {
	public static void findsubSet(String str, String ans, int i) {
		// base case
		if (i == str.length()) {
			if(ans.length()==0) {
				System.out.println("null");
			}
			System.out.println(ans);
			return;
		}
		//recursion
		// yes choice
		findsubSet(str, ans + str.charAt(i), i + 1);
		// no choice
		findsubSet(str, ans, i + 1);
	}

	public static void main(String[] args) {
		String str = "abc";
		findsubSet(str, "", 0);
	}
}
