package exceptionHandling;
import java.io.IOException;

/*throw: Used to explicitly throw an exception. In the example, it throws a checked exception 
 * (IOException) within a method, and the calling method or block needs to handle this exception 
 * using a try-catch block.
 * 
 *  throw keyword is used to throw an exception explicitly.
* throw keyword is used inside method body.
* we can throw only one exception only one at a time.
* to define exception
* only used for single exception
* it is followed by object
 */
public class ThrowAndThrows {
	// Example of 'throw'
	static void exampleThrow() {
		try {
			throw new IOException("This is a checked exception.");
		} catch (IOException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	}

	/*
	 * throws: Used in the method signature to declare that a method may throw one
	 * or more types of exceptions. It doesn't throw an exception itself but signals
	 * that the method might propagate an exception of the specified type. The
	 * calling method or block is responsible for handling the declared
	 * exception(s).
	 * 
	 * * throw keyword is used to declare an exception. throw keyword is used with
	 * method signature. we can handle multiple exception using throw keyword.. only
	 * used for multiple exception it is followed by class(mtd) write beside method.
	 */
	// Example of 'throws'
	static void exampleThrows() throws RuntimeException {
		throw new RuntimeException("This is an unchecked exception.");
	}

	public static void main(String[] args) {
		// Example of 'throw'
		exampleThrow();

		// Example of 'throws'
		try {
			exampleThrows();
		} catch (RuntimeException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	}
}
/*
 * In the main method, exampleThrow demonstrates the use of throw by throwing a
 * checked exception, and exampleThrows shows the use of throws to declare that
 * it may throw an unchecked exception.
 * 
 * 
 */
