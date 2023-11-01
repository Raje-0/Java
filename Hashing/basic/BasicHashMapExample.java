package basic;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Accessing elements
        System.out.println("Value for key 'One': " + hashMap.get("One"));

        // Modifying elements
        hashMap.put("One", 10);

        // Displaying all key-value pairs in the HashMap
        System.out.println("All key-value pairs in the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing elements
        hashMap.remove("Two");

        // Displaying all key-value pairs in the HashMap after removal
        System.out.println("All key-value pairs in the HashMap after removal:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

