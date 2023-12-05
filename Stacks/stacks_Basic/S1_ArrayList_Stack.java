package stacks_Basic;

import java.util.ArrayList;

public class S1_ArrayList_Stack {
	static class Stack {
		static ArrayList<Integer> list = new ArrayList<>();

		public static boolean isEmpty() {
			return list.size() == 0;
		}

		// push
		public static void push(int data) {
			list.add(data);
		}

		// pop
		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1); //list.size() - 1=last index
			list.remove(list.size() - 1);
			return top;
		}

		// peak
		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return list.get(list.size() - 1);
		}
	}

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.peek());
		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
