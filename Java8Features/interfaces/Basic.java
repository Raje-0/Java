package interfaces;

//Functional Interface
@FunctionalInterface
interface Calculator {
	int operate(int a, int b);
}

//Main class
public class Basic {
	public static void main(String[] args) {
		// Using lambda expression to implement the abstract method of the functional
		// interface
		Calculator addition = (a, b) -> a + b;
		Calculator subtraction = (a, b) -> a - b;
		Calculator multiplication = (a, b) -> a * b;

		// Using the functional interfaces
		int result1 = addition.operate(5, 3);
		int result2 = subtraction.operate(8, 4);
		int result3 = multiplication.operate(2, 6);

		// Displaying the results
		System.out.println("Addition Result: " + result1);
		System.out.println("Subtraction Result: " + result2);
		System.out.println("Multiplication Result: " + result3);
	}
}
