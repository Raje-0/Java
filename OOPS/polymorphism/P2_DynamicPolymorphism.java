package polymorphism;
/*2. Runtime (Dynamic) Polymorphism:
This type of polymorphism is achieved through method overriding, where a subclass provides a 
specific implementation of a method that is already defined in its superclass. The decision of 
which method to execute is based on the actual type of the object at runtime. 

 * 
 */

//Superclass
class Animal {
	public void makeSound() {
		System.out.println("Some sound");
	}
}

//Subclass
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
}

//Subclass
class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

//Main class
public class P2_DynamicPolymorphism {
	public static void main(String[] args) {
		Animal animal1 = new Dog(); // Dog object
		Animal animal2 = new Cat(); // Cat object

		animal1.makeSound(); // Output: Bark
		animal2.makeSound(); // Output: Meow
	}
}
