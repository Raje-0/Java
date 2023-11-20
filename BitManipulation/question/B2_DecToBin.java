package question;

import java.util.Scanner;

public class B2_DecToBin {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binaryNumber = convertToBinary(decimalNumber);

        // Display the result
        System.out.println("Binary representation: " + binaryNumber);

        scanner.close();
    }

    private static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Prepend the remainder to the front of the string
            decimalNumber /= 2;
        }

        return binary.toString();
    }
}
