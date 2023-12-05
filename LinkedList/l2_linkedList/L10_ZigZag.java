package l2_linkedList;

public class L10_ZigZag {
	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static void zigzagLinkedList(Node head) {
		if (head == null || head.next == null) {
			return;
		}

		// Step 1: Find middle of the LinkedList
		Node slow = head, fast = head.next;
		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}
		Node mid = slow;

		// Step 2: Reverse the second half of the LinkedList

		Node curr = mid.next;
		mid.next = null;
		Node prev = null;
		Node next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node left = head;
		Node right = prev;
		Node nextL, nextR;

		// Step 3: Merge the first and reversed second half alternately
		while (left != null && right != null) {
			nextL = left.next;
			left.next = right;
			nextR = right.next;
			right.next = nextL;

			left = nextL;
			right = nextR;
		}
	}

	// Helper method to print the LinkedList
	private static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Example usage
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.println("Original LinkedList:");
		printLinkedList(head);

		zigzagLinkedList(head);

		System.out.println("Zigzag LinkedList:");
		printLinkedList(head);
	}
}
