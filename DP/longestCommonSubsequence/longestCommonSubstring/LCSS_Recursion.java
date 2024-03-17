package longestCommonSubsequence.longestCommonSubstring;

public class LCSS_Recursion {

	 // Recursive approach
    public static String longestCommonSubStringRecursive(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] memo = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    memo[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                    if (memo[i][j] > maxLength) {
                        maxLength = memo[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    memo[i][j] = 0;
                }
            }
        }

        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }

    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "xyzabcde";
        
        // Recursive
        System.out.println("Longest common substring (recursive): " + longestCommonSubStringRecursive(str1, str2));
    }
}
