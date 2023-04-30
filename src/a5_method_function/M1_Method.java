package a5_method_function;

public class M1_Method {
	public static void printHello() {
		System.out.println("hello world");
	}

	public static void sum(int x, int y) { // parameter or formal parameter
		System.out.println("sum is " + (x + y));
	}

	public static void sum(int x, int y, int z) {
		System.out.println("sum is " + (x + y + z));
	}

	public static void sum(int x, int y, int z, int n) {
		System.out.println("sum is " + (x + y + z + n));
	}

	public static void main(String[] args) {
		printHello();

		sum(1, 2, 6);// argument or actual parameter
	}

}
