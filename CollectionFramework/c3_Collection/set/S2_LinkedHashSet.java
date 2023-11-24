package c3_Collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class S2_LinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> set= new LinkedHashSet<>();
		
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
