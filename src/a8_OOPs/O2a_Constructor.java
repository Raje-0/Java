package a8_OOPs;

class Test {
	int a;
	int b;
	int c;

	public Test() {

		System.out.println("1st constructor");
		a = 1;
	}

	public Test(int n) {
		b = n;
		System.out.println("2nd constructor");

	}

	public Test(int n, int m) {
		b = n;
		c = m;
		System.out.println("3rd constructor");
	}
}

public class O2a_Constructor {

	public static void main(String[] args) {

		Test t1 = new Test(9, 8);
		System.out.println(t1.b);

	}

}
