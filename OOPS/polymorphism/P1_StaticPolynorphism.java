package polymorphism;

/*Compile-time (Static) Polymorphism:
This type of polymorphism is achieved through method overloading, where multiple methods 
can have the same name but different parameters. The Java compiler determines which method 
to call based on the number and type of arguments passed to the method. Here's an example:
 * 
 */
public class P1_StaticPolynorphism {

	// Method for adding two integers
	public int add(int x, int y) {
		return x + y;
	}

	// Method for adding three integers
	public int add(int x, int y, int z) {
		return x + y + z;
	}

	// Method for adding two double numbers
	public double add(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		P1_StaticPolynorphism calc = new P1_StaticPolynorphism();

		// Call the appropriate method based on the parameters
		System.out.println("Sum of 5 and 7: " + calc.add(5, 7));
		System.out.println("Sum of 3, 4, and 5: " + calc.add(3, 4, 5));
		System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
	}
}
