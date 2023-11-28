package questios;

import l1_linkesList.LinkedList.Node;

public class FindAndremove_Nth_Node_from_end {
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

		public void deleteFromEnd(int n) {
			// size
			int size = 0;
			Node temp = head;
			while (temp != null) {
				temp = temp.next;
				size++;
			}
			if (n == size) {
				head = head.next;
				return;
			}
			int i = 1;
			int iToFind = size - n;
			Node prev = head;
			while (i < iToFind) {
				prev = prev.next;
				i++;
			}

			prev.next = prev.next.next;
			return;
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FindAndremove_Nth_Node_from_end l = new FindAndremove_Nth_Node_from_end();
			
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addFirst(5);
		
		l.deleteFromEnd(2);
		l.display();
	}
}
