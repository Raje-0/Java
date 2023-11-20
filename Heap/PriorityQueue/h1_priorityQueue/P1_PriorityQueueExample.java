package h1_priorityQueue;

import java.util.PriorityQueue;

public class P1_PriorityQueueExample {
	public static void main(String[] args) {
		// Creating a Priority Queue
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		//PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

		// Adding elements to the Priority Queue
		priorityQueue.add(5);
		priorityQueue.add(12);
		priorityQueue.add(3);
		priorityQueue.add(7);
		priorityQueue.add(10);

		// Printing the top element of the Priority Queue
		System.out.println("Top element of the Priority Queue: " + priorityQueue.peek());

		// Printing the PriorityQueue
		System.out.println("PriorityQueue: " + priorityQueue);

		// Removing the top element
		int removedElement = priorityQueue.poll();
		System.out.println("Removed Element: " + removedElement);

		// Printing the PriorityQueue after removal
		System.out.println("PriorityQueue after removal: " + priorityQueue);

		// Peek the top element
		int topElement = priorityQueue.peek();
		System.out.println("Top Element: " + topElement);

		// Printing the final PriorityQueue
		System.out.println("Final PriorityQueue: " + priorityQueue);
		// Removing the top element of the Priority Queue
		priorityQueue.poll();

		// Printing all elements of the Priority Queue
		System.out.println("Elements of the Priority Queue: ");
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}
}
