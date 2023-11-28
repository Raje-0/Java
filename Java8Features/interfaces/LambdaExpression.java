package interfaces;
//functional interface have only one abstract mtd,
@FunctionalInterface
interface A {
	void show();
}

public class LambdaExpression {

	public static void main(String[] args) {
		A obj = () -> System.out.println("this is lambda expression");

		obj.show();
	}

}
