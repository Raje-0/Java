package l2_linkedList;

public class L1_DetectAndDeleteLoop {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size = 0;

	// add at first
	public void addFirst(int val) {
		// step 1 = create new node
		Node newNode = new Node(val);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step 2
		newNode.next = head;
		// step 3
		head = newNode;
	}

//display
	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public static boolean isCycle() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = head;
		System.out.println(isCycle());

	}

}
