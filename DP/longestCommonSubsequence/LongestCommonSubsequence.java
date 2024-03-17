package longestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequence {
    
    // Recursive approach
    public static int lcsRecursive(String s1, String s2) {
        return lcsRecursiveHelper(s1, s2, s1.length(), s2.length());
    }

    private static int lcsRecursiveHelper(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0)
            return 0;

        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return 1 + lcsRecursiveHelper(s1, s2, m - 1, n - 1);
        else
            return Math.max(lcsRecursiveHelper(s1, s2, m, n - 1), lcsRecursiveHelper(s1, s2, m - 1, n));
    }
    
    // Memoization approach
    public static int lcsMemoization(String s1, String s2) {
        int[][] memo = new int[s1.length() + 1][s2.length() + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return lcsMemoizationHelper(s1, s2, s1.length(), s2.length(), memo);
    }

    private static int lcsMemoizationHelper(String s1, String s2, int m, int n, int[][] memo) {
        if (m == 0 || n == 0)
            return 0;

        if (memo[m][n] != -1)
            return memo[m][n];

        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return memo[m][n] = 1 + lcsMemoizationHelper(s1, s2, m - 1, n - 1, memo);
        else
            return memo[m][n] = Math.max(lcsMemoizationHelper(s1, s2, m, n - 1, memo), lcsMemoizationHelper(s1, s2, m - 1, n, memo));
    }
    
    // Tabulation approach
    public static int lcsTabulation(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        System.out.println("Length of Longest Common Subsequence (Recursive): " + lcsRecursive(s1, s2));
        System.out.println("Length of Longest Common Subsequence (Memoization): " + lcsMemoization(s1, s2));
        System.out.println("Length of Longest Common Subsequence (Tabulation): " + lcsTabulation(s1, s2));
    }
}
