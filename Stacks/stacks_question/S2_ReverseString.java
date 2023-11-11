package stacks_question;

import java.util.Stack;

public class S2_ReverseString {
	
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
		// TODO Auto-generated method stub
		String inputString = "abcd";
		// Reversing using stack
		System.out.println("Reversed using stack: " + reverseStringUsingStack(inputString));
	}

}
