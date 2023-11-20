package basic;

public class FindPermutationOfString {
	public static void find(String str, String ans) {
//case case
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		// recursion
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			String newString = str.substring(0, i) + str.substring(i + 1);

			find(newString, ans + curr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		find(str, "");
	}

}
