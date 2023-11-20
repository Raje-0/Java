package basic;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListQueue {
	private Node front, rear;

	public LinkedListQueue() {
		this.front = this.rear = null;
	}

	// Method to add an element to the queue
	public void enqueue(int data) {
		Node newNode = new Node(data);

		// If the queue is empty, set the new node as both front and rear
		if (rear == null) {
			front = rear = newNode;
			return;
		}

		// Otherwise, add the new node at the end and update the rear
		rear.next = newNode;
		rear = newNode;
	}

	// Method to remove an element from the queue
	public void dequeue() {
		// If the queue is empty, do nothing
		if (front == null) {
			return;
		}

		// Otherwise, remove the front node and update the front
		front = front.next;

		// If the front becomes null, set the rear to null as well
		if (front == null) {
			rear = null;
		}
	}

	// Method to get the front element of the queue
	public int front() {
		// If the queue is empty, return an invalid value (you can throw an exception as
		// well)
		if (front == null) {
			System.out.println("Queue is empty");
			return -1;
		}

		return front.data;
	}

	// Method to check if the queue is empty
	public boolean isEmpty() {
		return front == null;
	}
}

public class Q3_LinkedListQueue {
	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Front element is " + queue.front());

		queue.dequeue();
		System.out.println("Front element is " + queue.front());

		System.out.println("Is the queue empty? " + queue.isEmpty());
	}
}
