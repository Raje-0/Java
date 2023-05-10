package a8_OOPs;

abstract class Animal {
	abstract void walk();

	void breathe() {
		System.out.println("this animal breathes air");
	}
}

class Horse extends Animal {

	@Override
	void walk() {
		System.out.println("walks on 4 legs");

	}

}

class Chicken extends Animal {

	@Override
	void walk() {
		System.out.println("walks on 2 legs");

	}

}

public class O8_Abstraction {

	public static void main(String[] args) {
Horse h1 = new Horse();
h1.breathe();
h1.walk();
	}

}
