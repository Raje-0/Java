package stacks_question;

import java.util.Stack;

public class S11_ValidParentheses {

	 public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (int i=0; i<s.length();i++) {
	        	char ch=s.charAt(i);
	            if (ch == '(' || ch == '[' || ch == '{') {
	                stack.push(ch);
	            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } else {
	                return false; // If none of the above conditions are met, it's an invalid character
	            }
	        }

	        return stack.isEmpty(); // If the stack is empty, all parentheses are valid
	    }

	    public static void main(String[] args) {
	        String example1 = "()[]{}";
	        String example2 = "([)]";
	        String example3 = "{[]}";

	        System.out.println("Example 1 is valid: " + isValid(example1));
	        System.out.println("Example 2 is valid: " + isValid(example2));
	        System.out.println("Example 3 is valid: " + isValid(example3));
	    }
	}
