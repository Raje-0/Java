package keyword;
/*
 * 
 * super may be variable also
 */
class A {
	public A() {
		System.out.println("I am constructor of A");
	}

	public A(int i) {
		System.out.println("I am paramiterised constructor of A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("I am contructor of B");
	}

	public B(int i) {
		super(i);
		System.out.println("I am parameterized constructor of B");
	}

}

public class K2_Super {

	public static void main(String[] args) {

		B b = new B(5);
	}

}
