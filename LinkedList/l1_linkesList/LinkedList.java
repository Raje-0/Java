package l1_linkesList;

public class LinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
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
		// step 2 =assign new node next value = head
		newNode.next = head;
		// step 3
		head = newNode;
	}

	// add at end
	public void addLast(int val) {
		Node newNode = new Node(val);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step 2
		tail.next = newNode;
		// step 3
		tail = newNode;
	}

//display
	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

//insert in middle o(n) 
	void insertAt(int idx, int val) {

		Node newNode = new Node(val);
		size++;
		Node temp = head;
		int i = 0;
		while (i < idx - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

	// size
	int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;

	}

	// remove first
	public int removeFirst() {
		//condition
		if (size == 0) {
			System.out.println("ll is empty");
			return Integer.MAX_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		//main
		int val = head.data;
		head = head.next;
		size--;
		return val;

	}

	// remove last
	public int removeLast() {
		if (size == 0) {
			System.out.println("Linkedlist is empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;

		}
		// prev = size-2;
		Node prev = head;
		for (int i = 0; i <= size - 2; i++) {
			prev = prev.next;
		}
		int val = prev.next.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
	}

	// search in ll
	public int search(int key) {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (head.data == key) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;

	}

	// recursion search
	public int helper(Node head, int key) {
		if (head == null) {
			System.out.println("element not found");

		}
		if (head.data == key) {
			return 0;
		}
		int idx = helper(head.next, key);
		if (idx == -1) {
			return -1;
		}
		return idx + 1;
	}

	public int recursivesearch(int key) {
		return helper(head, key);
	}

//get at
	int getAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

//delete
	void delete(int idx) {
		if (idx == 0) {
			head = head.next;
			size--;
			return;
		}

		Node temp = head;
		for (int i = 1; i <= idx - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		tail = temp;
		size--;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(3);
		ll.addLast(5);

		ll.insertAt(2, 9);
		ll.display();
		System.out.println();
		System.out.println(ll.size());

		ll.removeFirst();
		ll.display();

		System.out.println(ll.getAt(1));

		ll.delete(1);
		System.out.println();
		ll.display();

		System.out.println();
		ll.addFirst(90);
		ll.display();
		/*
		 * System.out.println(); ll.removeLast(); ll.display();
		 */
		System.out.println();
		System.out.println(ll.search(10));

		System.out.println();
		System.out.println(ll.recursivesearch(1));
	}

}
