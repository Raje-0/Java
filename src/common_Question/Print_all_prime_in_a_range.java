package common_Question;

public class Print_all_prime_in_a_range {
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void primeInRange(int x) {
		for (int i = 2; i <= x; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		primeInRange(20);
	}

}
