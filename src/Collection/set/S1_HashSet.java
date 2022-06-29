package Collection.set;

import java.util.HashSet;
import java.util.Set;

public class S1_HashSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		
		set.remove(1);
		System.out.println(set);
		
		System.out.println(set.contains(4));
		
		System.out.println(set.size());
		
	}

}
