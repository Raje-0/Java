package varray;

/*In Java, a variable-length argument allows a method to accept a variable number 
 * of arguments. It is denoted by an ellipsis (...) followed by the parameter type. 
 * This feature was introduced in Java 5 to simplify the creation of methods that need to 
 * handle a varying number of parameters. Here is an example to illustrate how variable-length 
 * arguments work in Java:
 */
public class VariableLengthArgumentsExample {

	// Method with variable-length arguments
	public static void printNumbers(int... numbers) {
		System.out.println("The numbers are:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Calling the method with different numbers of arguments
		printNumbers(1, 2, 3, 4);
		printNumbers(5, 6, 7);
		printNumbers(8, 9);
		printNumbers(10);
	}
}
