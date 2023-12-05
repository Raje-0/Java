package keyword;

/*In Java,"this"is a keyword that refers to the current instance of the class.
It is often used to distinguish instance variables from local variables when they have
the same name.Here's a simple example: 
 */
public class K5_This_keyword {

	private int myNumber;

	public void setNumber(int number) {
		this.myNumber = number; // "this" refers to the instance variable
	}

	public int getNumber() {
		return this.myNumber; // "this" is optional here, but it makes the code clearer
	}

	public static void main(String[] args) {
		K5_This_keyword obj = new K5_This_keyword();
		obj.setNumber(42);
		System.out.println(obj.getNumber()); // Outputs 42
	}
}

/*
 * In the example, using "this" helps to clarify that myNumber refers to the
 * instance variable of the class rather than the local variable within the
 * setNumber method.
 */