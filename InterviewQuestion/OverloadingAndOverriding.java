
public class OverloadingAndOverriding {
	/*
	 * Method Overloading is demonstrated by the Calculator class, which has
	 * multiple methods named add with different parameter lists. Method overloading
	 * allows a class to have multiple methods with the same name but different
	 * parameter lists.
	 * 
	 */
	// Example of Method Overloading
	static class Calculator {

		// Method to add two integers
		int add(int a, int b) {
			return a + b;
		}

		// Method overloading to add three integers
		int add(int a, int b, int c) {
			return a + b + c;
		}

		// Method overloading to add two doubles
		double add(double a, double b) {
			return a + b;
		}
	}

	/*
	 * Method Overriding is demonstrated by the Animal and Dog classes. The Dog
	 * class extends the Animal class and overrides the makeSound method to provide
	 * a specific implementation for the subclass. Method overriding occurs when a
	 * subclass provides a specific implementation for a method that is already
	 * defined in its superclass.
	 * 
	 */
	// Example of Method Overriding
	static class Animal {

		// Method to make a sound
		void makeSound() {
			System.out.println("Animal makes a generic sound");
		}
	}

	// Subclass Dog overrides the makeSound method
	static class Dog extends Animal {

		// Overriding the makeSound method to provide a specific sound for Dog
		@Override
		void makeSound() {
			System.out.println("Dog barks");
		}
	}

	public static void main(String[] args) {

		// Method Overloading Example
		Calculator calculator = new Calculator();
		System.out.println("Sum of 2 integers: " + calculator.add(5, 7));
		System.out.println("Sum of 3 integers: " + calculator.add(3, 8, 2));
		System.out.println("Sum of 2 doubles: " + calculator.add(2.5, 3.7));

		System.out.println("\n---------------\n");

		// Method Overriding Example
		Animal animal = new Animal();
		animal.makeSound(); // Output: Animal makes a generic sound

		Dog dog = new Dog();
		dog.makeSound(); // Output: Dog barks
	}
}
