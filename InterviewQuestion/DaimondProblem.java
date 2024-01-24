
/*In this example, both interfaces B and C extend interface A, 
 * and class D implements both B and C. When trying to call the 
 * foo() method on an instance of class D, the compiler faces a 
 * dilemma as to whether to use the foo() method from interface B 
 * or from interface C. This ambiguity is the diamond problem.
 */
interface A {
	default void foo() {
		System.out.println("A's foo");
	}
}

interface B extends A {
	default void foo() {
		System.out.println("B's foo");
	}
}

interface C extends A {
	default void foo() {
		System.out.println("C's foo");
	}
}

// Diamond problem occurs here
class D implements B, C {

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		B.super.foo();
	}

}

public class DaimondProblem {
	public static void main(String[] args) {
		D d = new D();
		d.foo(); // Ambiguity! Which foo() method should be called?
	}
}
