package common_Question;

public class Binomial_coffi {
	public static int fac(int a) {
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;

		}
		return f;
	}

	public static int binoCoff(int n, int r) {
		int fact_n = fac(n);
		int fact_r = fac(r);
		int fact_nmr = fac(n - r);

		int binoCoff = fact_n / (fact_r * fact_nmr);
		return binoCoff;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binoCoff(5, 2));
	}

}
