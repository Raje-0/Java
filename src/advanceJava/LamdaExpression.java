package advanceJava;

@FunctionalInterface
 interface  A {
	void show();
}

public class LamdaExpression {

	public static void main(String[] args) {
		A obj=()->System.out.println("this is lambda expression");
		
		obj.show();
	}

}
