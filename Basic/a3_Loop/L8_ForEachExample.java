package a3_Loop;

public class L8_ForEachExample {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Using for-each loop to iterate through each element in the array
        // 'number' represents the current element being iterated over
        for (int number : numbers) {
            System.out.println("Current number: " + number);
        }
    }
}

