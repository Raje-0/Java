package fibonacci.climbingStair;

import java.util.Arrays;

public class ClimbingStair {
	// recursion =0()
	public static int countWay(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return countWay(n - 1) + countWay(n - 2);
	}

//Memorization =0(n)
	public static int countWaysM(int n, int ways[]) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		if (ways[n] != -1) { // already calculated
			return ways[n];
		}
		ways[n] = countWaysM(n - 1, ways) + countWaysM(n - 2, ways);
		return ways[n];
	}

	// Tabulation =0(n)
	public static int countWaysT(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 1;

		// tabulation loop
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				dp[i] = dp[i - 1] + 0;
			} else {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(countWay(n));

		int ways[] = new int[n + 1];
		Arrays.fill(ways, -1);
		System.out.println(countWaysM(n, ways));

		// Tabulation
		System.out.println(countWaysT(n));
	}

}
