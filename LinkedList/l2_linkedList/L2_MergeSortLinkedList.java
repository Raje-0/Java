package l2_linkedList;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class L2_MergeSortLinkedList {

	public static void main(String[] args) {
		// Example usage:
		Node head = new Node(3);
		head.next = new Node(1);
		head.next.next = new Node(4);
		head.next.next.next = new Node(2);

		System.out.println("Original linked list:");
		printList(head);

		head = mergeSort(head);

		System.out.println("Sorted linked list:");
		printList(head);
	}

	// Merge Sort function for linked list
	public static Node mergeSort(Node head) {
		// Base case: If the list is empty or has only one element, it is already
		// sorted.
		if (head == null || head.next == null) {
			return head;
		}

		// Split the linked list into two halves
		Node[] split = splitList(head);
		Node firstHalf = split[0];
		Node secondHalf = split[1];

		// Recursively sort both halves
		firstHalf = mergeSort(firstHalf);
		secondHalf = mergeSort(secondHalf);

		// Merge the sorted halves
		return merge(firstHalf, secondHalf);
	}

	// Merge two sorted linked lists
	public static Node merge(Node a, Node b) {
		Node result = null;

		// Base cases
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}

		// Choose the smaller value and recur
		if (a.data <= b.data) {
			result = a;
			result.next = merge(a.next, b);
		} else {
			result = b;
			result.next = merge(a, b.next);
		}

		return result;
	}

	// Split the linked list into two halves
	public static Node[] splitList(Node head) {
		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node[] split = new Node[2];
		split[0] = head;
		split[1] = slow.next;
		slow.next = null;

		return split;
	}

	// Utility function to print a linked list
	public static void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
