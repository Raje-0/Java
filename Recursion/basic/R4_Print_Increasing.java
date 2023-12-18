package basic;

public class R4_Print_Increasing {
	public static void printInc(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		printInc(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		printInc(n);

	}

}
