package interfaces;
/* Lambda Expression is just an anonymous (nameless) function. That means the function which 
doesn’t have the name, return type and access modifiers.
===you cannot use lambda expressions in Java without a functional interface. */

@FunctionalInterface // It is optional
interface Interf {
	public void sum1(int a, int b);
}

class Child implements Interf {
	public void sum1(int a, int b) {
		System.out.println("sum is =" + (a + b));
	}
}

public class LambdaExpression2 {

	public static void main(String[] args) {

		// with lambda
		Interf i = (int a, int b) -> {
			System.out.println("sum = " + (a + b));
		};
		i.sum1(10, 10);

	}

}
