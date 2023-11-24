package h3_set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Mango");
        treeSet.add("Apple");

        // Displaying the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Accessing the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Removing an element
        treeSet.remove("Banana");
        System.out.println("After removing 'Banana': " + treeSet);

        // Checking if an element is present
        System.out.println("Is 'Orange' present? " + treeSet.contains("Orange"));

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
