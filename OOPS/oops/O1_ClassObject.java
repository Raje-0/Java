package oops;

class Calc {

	int a;
	int b;
	int add;

	public void sum() {
		 add = a + b;
	}
}

public class O1_ClassObject {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.a = 4;
		obj.b = 6;
		obj.sum();
		System.out.println(obj.add);

	}

}
