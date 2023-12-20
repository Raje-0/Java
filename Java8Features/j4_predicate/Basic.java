package j4_predicate;

import java.util.function.Predicate;

// A predicate is a functional interface with a single argument and returns boolean value.
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(100));
		System.out.println(p.test(7));
		
		
		
	}

}
