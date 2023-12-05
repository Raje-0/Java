package l2_linkedList;

public class L12_DoublyLinkedList {
	public class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	// Method to insert a node at the beginning of the doubly linked list
	void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		if (head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}

	// Method to remove the first node from the doubly linked list
	void removeFirst() {
		if (head == null) {
			System.out.println("The list is empty. Cannot remove from an empty list.");
			return;

		}
		Node temp = head;
		head = head.next;

		if (head != null) {
			head.prev = null;
		}

		temp.next = null;
	}

	// reverse
	void reverse() {
		Node temp = null;
		Node current = head;

		// Swap next and prev pointers for all nodes of the doubly linked list
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		// Update the head to the last node
		if (temp != null) {
			head = temp.prev;
		}
	}

	// Method to insert a node at the end of the doubly linked list
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	// Method to print the doubly linked list forward
	void printForward() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Method to print the doubly linked list backward
	void printBackward() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		L12_DoublyLinkedList doublyLinkedList = new L12_DoublyLinkedList();

		// Inserting nodes at the end
		doublyLinkedList.insertAtEnd(1);
		doublyLinkedList.insertAtEnd(2);
		doublyLinkedList.insertAtEnd(3);
		doublyLinkedList.insertAtEnd(4);

		// Printing the doubly linked list in forward and backward directions
		System.out.println("Doubly Linked List (Forward):");
		doublyLinkedList.printForward();

		System.out.println("Doubly Linked List (Backward):");
		doublyLinkedList.printBackward();
	}
}
