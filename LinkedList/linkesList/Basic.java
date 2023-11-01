package linkesList;

public class Basic {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public static class LinkedList {

		Node head = null;
		Node tail = null;
		int size = 0;

//insert at end
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
			} else {
				tail.next = temp;
			}
			tail = temp;
			size++;
		}

//add at end
		void addLast(int val) {
			Node newNode = new Node(val);
			size++;
			if (head == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
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

//size
		int size() {
			int count = 0;
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;

		}

//insert at beginning
		void insertAthead(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = tail = temp;
			} else {
				temp.next = head;
				head = temp;
				size++;
			}
		}

//add at first
		public void addFirst(int val) {
			Node newNode = new Node(val);
			size++;
			if (head == null) {
				head = tail = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

//insert in middle
		void insertAt(int idx, int val) {
			if (idx == 0) {
				addFirst(val);
				return;
			}
			Node t = new Node(val);
			size++;
			Node temp = head;
			for (int i = 1; 1 <= idx - 1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;

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

//remove last
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

//search in ll
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

//recursion search
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
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(1);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		ll.insertAtEnd(6);
		ll.display();

		System.out.println();
		System.out.println(ll.size());

		ll.insertAthead(0);
		ll.display();

		System.out.println();
		ll.insertAt(1, 2);
		ll.display();

		System.out.println();

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
