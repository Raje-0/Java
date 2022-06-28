package ExceptionHandling;

public class E2_Finally {

	public static void main(String[] args) {
		try {
			int a[]=null;
			a[4]=8;
			int i=7;
			int j=2;
			int k=i/j;
			System.out.println("output is "+k);
		}
		catch (ArithmeticException e) {
			System.err.println("error"); // we can use multiple catch to show exeption
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("stay in your limit");
		}
		catch (Exception e) { //handle all exception
			System.out.println("something is wrong");
		}
		finally {
			System.out.println("bye"); //even error occur or not this will be excuted.
		}

	}

}
