package string;

public class BasicStringOperations {
	public static void main(String[] args) {
		// Define a sample string
		String sampleString = "This is a sample string for basic string operations.";

		// Length of the string
		int length = sampleString.length();
		System.out.println("Length of the string: " + length);

		// Convert the string to lowercase
		String lowercaseString = sampleString.toLowerCase();
		System.out.println("Lowercase string: " + lowercaseString);

		// Convert the string to uppercase
		String uppercaseString = sampleString.toUpperCase();
		System.out.println("Uppercase string: " + uppercaseString);

		// Check if the string contains a specific substring
		String substringToFind = "sample";
		boolean containsSubstring = sampleString.contains(substringToFind);
		System.out.println("Does the string contain the substring '" + substringToFind + "'? " + containsSubstring);

		// Find the index of a specific character in the string
		char charToFind = 's';
		int charIndex = sampleString.indexOf(charToFind);
		System.out.println("Index of the character '" + charToFind + "': " + charIndex);

		// Extract a substring from the original string
		int startIndex = 5;
		int endIndex = 10;
		String extractedSubstring = sampleString.substring(startIndex, endIndex);
		System.out.println("Extracted substring: " + extractedSubstring);

		// Replace a substring with another string
		String substringToReplace = "sample";
		String replacementString = "basic";
		String replacedString = sampleString.replace(substringToReplace, replacementString);
		System.out.println("String after replacement: " + replacedString);

		// Split the string based on a delimiter
		String[] splitStringArray = sampleString.split(" ");
		System.out.println("String split into an array:");
		for (String s : splitStringArray) {
			System.out.println(s);
		}
	}
}
