package aa11_Class;

/*In Java, an enum type is a special data type that enables a variable to
 *  be a set of predefined constants. The enum type is a more powerful and type-safe 
 *  alternative to traditional int-based constants. Enums are used to define collections 
 *  of constants, which can greatly improve code readability and maintainability.
 */
public class C2_EnumClass {
	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}

}
