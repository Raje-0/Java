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

	// remove rechecks it
	public static void removeCycle() {
		// detect cycle
		Node fast = head;
		Node slow = head;
		boolean cycle = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				cycle = true;
				break;
			}
		}
		if (cycle == false) {
			return;
		}
		// find meeting point
		slow = head;
		Node prev = null; // last node
		while (slow != null) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		// remove cycle-> last.next= null
		prev.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Node(1);
		Node temp = new Node(2);

		head.next = temp;
		head.next.next = new Node(3);
		head.next.next.next = temp;
		System.out.println(isCycle());
		removeCycle();
		System.out.println(isCycle());

	}

}
