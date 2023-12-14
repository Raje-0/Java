package polymorphism.covarient;

/*In Java, covariance refers to the ability of a method's return type to be a 
 * subtype of the type declared in the method signature. It is related to the 
 * concept of polymorphism and is often used in the context of overriding 
 * methods in subclasses.*/
class Animal {
	String sound() {
		return "Some generic sound";
	}
}

class Dog extends Animal {
	@Override
	String sound() {
		return "Woof! Woof!";
	}
}

class Cat extends Animal {
	@Override
	String sound() {
		return "Meow! Meow!";
	}
}

public class CovarianceExample {
	public static void main(String[] args) {
		Animal animal = new Dog(); // Covariant assignment
		System.out.println(animal.sound()); // Output: Woof! Woof!

		animal = new Cat(); // Covariant assignment
		System.out.println(animal.sound()); // Output: Meow! Meow!
	}
}
