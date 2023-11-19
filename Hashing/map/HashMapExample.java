package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Alice", 28);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 25);
        hashMap.put("Diana", 32);

        // Accessing elements using keys
        System.out.println("Age of Bob: " + hashMap.get("Bob"));

        // Iterating over the HashMap
      for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
           System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
      //apna college
        Set <String> keys= hashMap.keySet();
        System.out.println(keys);

        // Checking if a key exists
        String searchKey = "Charlie";
        if (hashMap.containsKey(searchKey)) {
            System.out.println(searchKey + " is present, Age: " + hashMap.get(searchKey));
        } else {
            System.out.println(searchKey + " is not present in the HashMap.");
        }

        // Removing an element based on key
        hashMap.remove("Diana");

        // Size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());
    }
}

