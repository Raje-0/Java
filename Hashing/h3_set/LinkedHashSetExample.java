package h3_set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {   //insertion order preserved.
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");

        // Display the elements in the order they were inserted
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Iterate over the elements using an iterator
        System.out.println("Iterating over LinkedHashSet elements:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Check if an element is present
        String searchElement = "Banana";
        System.out.println("Is '" + searchElement + "' present? " + linkedHashSet.contains(searchElement));

        // Remove an element
        String removeElement = "Orange";
        linkedHashSet.remove(removeElement);
        System.out.println("After removing '" + removeElement + "': " + linkedHashSet);

        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}
