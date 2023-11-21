package stacks_Basic;

import java.util.Stack;

public class S3_Colections_Stacks {

	public static void main(String[] args) {
		// Stack s = new Stack();
		 // Creating a stack of integers
        Stack<Integer> s = new Stack<>();

        // Pushing elements onto the stack
        s.push(10);
        s.push(20);
        s.push(30);

        // Displaying the stack
        System.out.println("Stack: " + s);

        // Popping an element from the stack
        int poppedElement = s.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Displaying the stack after popping
        System.out.println("Stack after popping: " + s);

        // Peeking at the top element without removing it
        int topElement = s.peek();
        System.out.println("Top Element: " + topElement);

        // Displaying the stack after peeking
        System.out.println("Stack after peeking: " + s);
		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
