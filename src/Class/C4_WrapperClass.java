package Class;

/*we use int , float etc for storing data
 * 
 */
public class C4_WrapperClass {

	public static void main(String[] args) {
		int i = 5; // primitive datatype

		/*
		 * we can use Interger(class) to store data
		 * 
		 */
		Integer ii = new Integer(i); // wrappering or boxing
	int j=ii.intValue();   //unwrappering or unboxing 
	
	}

}
