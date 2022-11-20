package OOPs;

class Calculator {
	void sum(int x, int y) {
		System.out.println("sum is " + (x + y));
	}

	void sum(int x, int y, int z) {
		System.out.println("sum is " + (x + y + z));
	}
	
	void sum(int x, int y, int z, int n) {
		System.out.println("sum is " + (x + y + z+ n));
	}
}

public class O3_Method {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		obj.sum(1, 2, 5,8);
	}

}
