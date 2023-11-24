
package h2_map;

import java.util.Map;
import java.util.TreeMap;

public class M4_TreeMap {

	public static void main(String[] args) {
		// Creating a TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		// Adding elements to the TreeMap
		treeMap.put("John", 25);
		treeMap.put("Alice", 30);
		treeMap.put("Bob", 22);
		treeMap.put("Eva", 28);

		// Displaying the TreeMap
		System.out.println("TreeMap: " + treeMap);

		// Accessing elements in TreeMap
		System.out.println("Age of Alice: " + treeMap.get("Alice"));

		// Iterating through the TreeMap using entrySet()
		System.out.println("Iterating through TreeMap using entrySet():");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
