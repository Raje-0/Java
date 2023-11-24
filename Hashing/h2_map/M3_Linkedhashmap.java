package h2_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class M3_Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a LinkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		// Adding elements to the LinkedHashMap
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);

		// Displaying the elements of the LinkedHashMap
		System.out.println("LinkedHashMap Elements: " + linkedHashMap);

		// Accessing elements using keys
		System.out.println("Value associated with key 'Two': " + linkedHashMap.get("Two"));

		// Iterating through the entries of the LinkedHashMap
		System.out.println("Iterating through LinkedHashMap entries:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
