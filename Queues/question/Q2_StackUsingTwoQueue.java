package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q2_StackUsingTwoQueue {
	static class Stack {
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();

		// is empty
		public static boolean isEmpty() {
			return q1.isEmpty() && q2.isEmpty();
		}

		// Push element onto the stack
		public static void push(int x) {
			// Move all elements from queue1 to queue2
			if (!q1.isEmpty()) {
				q1.add(x);
			} else
				q2.add(x);
		}

		// Removes the element on the top of the stack
		public int pop() {
			if (isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			int top = -1;

			// case 1
			if (!q1.isEmpty()) {
				while (!q1.isEmpty()) {
					top = q1.remove();
					if (q1.isEmpty()) {
						break;
					}
					q2.add(top);
				}
			} else {// case 2
				while (!q2.isEmpty()) {
					top = q2.remove();
					if (q2.isEmpty()) {
						break;
					}
					q1.add(top);
				}
			}
			return top;
		}

		// Returns the element on the top of the stack
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			int top = -1;

			// case 1
			if (!q1.isEmpty()) {
				while (!q1.isEmpty()) {
					top = q1.remove();

					q2.add(top);
				}
			} else {// case 2
				while (!q2.isEmpty()) {
					top = q2.remove();

					q1.add(top);
				}
			}
			return top;
		}

		// Returns whether the stack is empty

	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}