package questions;

public class R11_xToThepowerN {
	public static double power(double x, int n) {
		if (n == 0) {
			return 1;
		}
		double xnm1 = power(x, n - 1);
		double xn = x * xnm1;
		return xn;

	}

	public static int powerOtmimum(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int halfpowerSq = powerOtmimum(a, n / 2) * powerOtmimum(a, n / 2);
		// for odd
		if (n % 2 != 0) {
			halfpowerSq = a * halfpowerSq;
		}
		return halfpowerSq;
	}

	public static void main(String[] args) {
		int a = 2;
		int n = 10;
		System.out.println(powerOtmimum(a, n));
	}
}
