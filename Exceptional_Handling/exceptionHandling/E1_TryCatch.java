package exceptionHandling;

public class E1_TryCatch {

	public static void main(String[] args) {
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.err.println("Error");
		}
		System.out.println("bye");
	}

}
