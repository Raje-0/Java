package OOPs;
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

public class O10_MtdOverriding {

	public static void main(String[] args) {

		B obj = new B();
		obj.show();
	}

}
