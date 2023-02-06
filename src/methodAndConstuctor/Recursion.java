//Recursion is the technique of making a function call itself. This technique 
//provides a way to break complicated problems down into simple problems which are easier to solve.

package methodAndConstuctor;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int result = sum(10);
		    System.out.println(result);
		  }
		  public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
	}

}
