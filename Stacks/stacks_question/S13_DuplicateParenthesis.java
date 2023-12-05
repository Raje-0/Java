package stacks_question;

import java.util.Stack;

public class S13_DuplicateParenthesis {

	// Function to check for duplicate parentheses
	static boolean hasDuplicateParenthesis(String expression) {
		Stack<Character> stack = new Stack<>();

		// Iterate through each character in the expression
		for (char ch : expression.toCharArray()) {
			// If the current character is not a closing parenthesis
			if (ch != ')') {
				stack.push(ch);
			} else {
				// If the top of the stack is an opening parenthesis,
				// then there are duplicate parentheses
				if (stack.peek() == '(') {
					return true;
				}

				// Pop elements from the stack until an opening parenthesis is found
				while (!stack.isEmpty() && stack.peek() != '(') {
					stack.pop();
				}

				// Pop the opening parenthesis
				stack.pop();
			}
		}

		// If the stack is not empty at the end, there are unmatched parentheses
		return !stack.isEmpty();
	}

	public static void main(String[] args) {
		String expression1 = "((a+b)+(c+d))";
		String expression2 = "((a+b)+(c+d)";
		String expression3 = "(a+b)+(c+d))";
		String expression4 = "(a+b)+(c+d)";

		System.out.println("Expression 1 has duplicate parentheses: " + hasDuplicateParenthesis(expression1));
		System.out.println("Expression 2 has duplicate parentheses: " + hasDuplicateParenthesis(expression2));
		System.out.println("Expression 3 has duplicate parentheses: " + hasDuplicateParenthesis(expression3));
		System.out.println("Expression 4 has duplicate parentheses: " + hasDuplicateParenthesis(expression4));
	}
}