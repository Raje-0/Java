package h3_set;

import java.util.HashSet;
import java.util.Iterator;

/*  1.2 Set
            - Properties:
            - Does not allow duplicate elements.
            - No specific order is guaranteed.
            - NuLL is allowed .
              
        1.2.1 HashSet
        1.2.2 LinkedHashSet
        1.2.3 TreeSet
              
 * 
 */
public class HashSetExample {
	public static void main(String[] args) {
		// Creating a HashSet
		HashSet<String> hashSet = new HashSet<>();

		// Adding elements to the HashSet
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");
		hashSet.add("Kiwi");
		hashSet.add("Banana"); // Adding a duplicate element

		// Displaying the HashSet
		System.out.println("HashSet: " + hashSet);

		// Checking if an element exists in the HashSet
		String searchElement = "Apple";
		if (hashSet.contains(searchElement)) {
			System.out.println(searchElement + " is present in the HashSet.");
		} else {
			System.out.println(searchElement + " is not present in the HashSet.");
		}

		// Removing an element from the HashSet
		String removeElement = "Grapes";
		hashSet.remove(removeElement);

		// Displaying the modified HashSet
		System.out.println("HashSet after removing " + removeElement + ": " + hashSet);

		// Size of the HashSet
		System.out.println("Size of the HashSet: " + hashSet.size());
	
		
		//iterrator
	Iterator it =hashSet.iterator();
	while(it.hasNext()) {
		System.out.println("val using Iterator= "+it.next());
	}
	
	for(String val:hashSet) {
		System.out.println("val using inhance for loop = "+val);
	}
	}
}
