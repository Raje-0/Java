package a1_Baisc;

public class J3_TypeCasting {

	public static void main(String[] args) {

		int a = (int) 6.8888;
		System.out.println(a);

		/*
		 * Implicit Casting (Widening): This happens when you assign a value of a
		 * smaller data type to a variable of a larger data type. Java automatically
		 * performs this type of casting without any loss of data.
		 */
		int smallNumber = 10;
		long largerNumber = smallNumber; // Implicit casting from int to long
		System.out.println(largerNumber); // Output: 10

		/*
		 * Explicit Casting (Narrowing): This occurs when you assign a value of a larger
		 * data type to a variable of a smaller data type. Explicit casting requires you
		 * to use the target data type in parentheses before the value you want to cast.
		 */

		double bigNumber = 123.456;
		int smallNumber2 = (int) bigNumber; // Explicit casting from double to int
		System.out.println(smallNumber); // Output: 123

	}

}
