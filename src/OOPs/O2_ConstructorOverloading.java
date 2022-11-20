package OOPs;

class Cal {
	int num1;
	int num2;
	String abc;

	public Cal() {
		num1 = 0;
		num2 = 0;
		abc = "nothing";
	}

	public Cal(int i) {
		num1 = 8;
	}

	public Cal(int i, double j) {

	}

	public Cal(int i, double j, String k) {

	}
}

public class O2_ConstructorOverloading {

	public static void main(String[] args) {

		Cal obj= new Cal(4);
		System.out.println(obj.num1);
	}

}
