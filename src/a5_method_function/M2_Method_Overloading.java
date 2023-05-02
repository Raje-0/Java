package a5_method_function;
/*
 * 
 */
class A {
	public void show() {
		System.out.println("In A");
	}
}

class B extends A {
	@Override // Class B overriding the mtd of A
	public void show() {
		System.out.println("in B");
	}
}

public class M2_Method_Overloading {

	public static void main(String[] args) {

		B obj = new B();
		obj.show();
	}

}
