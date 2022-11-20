package interfaces;

interface Demo {
	void abc();

	default void show() {
		System.out.println("with the help of default interface we can define mtd in interface");
	}

}

class Inplementor implements Demo {
	public void abc() {
		System.out.println("I am demo");
	}
}

public class DefaultInterface {

	public static void main(String[] args) {
		Demo obj = new Inplementor();
		obj.abc();
		obj.show();
	}

}
