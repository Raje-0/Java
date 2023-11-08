package basic;

public class SubSetOfString {
	public static void findsubSet(String str, String ans, int i) {
		// base case
		if (i == str.length()) {
			if(ans.length()==0) {
				System.out.println("null");
			}
			System.out.println(ans);
			return;
		}
		// yes
		findsubSet(str, ans + str.charAt(i), i + 1);
		// no
		findsubSet(str, ans, i + 1);
	}

	public static void main(String[] args) {
		String str = "abc";
		findsubSet(str, "", 0);
	}
}
