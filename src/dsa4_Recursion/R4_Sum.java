package dsa4_Recursion;

public class R4_Sum {
	public static int calcSum(int n) {
		if (n == 1) {
			return 1;
		}
		int Snm1 = calcSum(n - 1);
		int Sn = n + Snm1;
		return Sn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(calcSum(n));

	}

}
