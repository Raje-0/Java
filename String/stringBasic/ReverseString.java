package stringBasic;

import java.util.Stack;

public class ReverseString {

	// Method 1: Using StringBuilder
	public static String reverseStringUsingStringBuilder(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		return stringBuilder.reverse().toString();
	}

	// Method 2: Using StringBuffer
	public static String reverseStringUsingStringBuffer(String input) {
		StringBuffer stringBuffer = new StringBuffer(input);
		return stringBuffer.reverse().toString();
	}

	// Method 3: Using iterative approach
	public static String reverseStringUsingIteration(String input) {
		char[] characters = input.toCharArray();
		int left = 0;
		int right = characters.length - 1;

		while (left < right) {
			// Swap characters
			char temp = characters[left];
			characters[left] = characters[right];
			characters[right] = temp;

			// Move indices towards the middle
			left++;
			right--;
		}
		return new String(characters);
	}

	// Method 4: Using recursion
	public static String reverseStringUsingRecursion(String input) {
		if (input.isEmpty()) {
			return input;
		}
		// Calling function recursively
		return reverseStringUsingRecursion(input.substring(1)) + input.charAt(0);
	}

	// Method 5: Using Stack
	public static String reverseStringUsingStack(String input) {
		Stack<Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			stack.push(c);
		}
		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		return reversed.toString();
	}

	public static void main(String[] args) {
		String inputString = "abcd";

		System.out.println("Original String: " + inputString);

		// Reversing using StringBuilder
		System.out.println("Reversed using StringBuilder: " + reverseStringUsingStringBuilder(inputString));

		// Reversing using StringBuffer
		System.out.println("Reversed using StringBuffer: " + reverseStringUsingStringBuffer(inputString));

		// Reversing using iteration
		System.out.println("Reversed using iteration: " + reverseStringUsingIteration(inputString));

		// Reversing using recursion
		System.out.println("Reversed using recursion: " + reverseStringUsingRecursion(inputString));

		// Reversing using stack
		System.out.println("Reversed using stack: " + reverseStringUsingStack(inputString));
	}

}
