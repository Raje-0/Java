package questios;

import l1_linkesList.ReverseLL.Node;

public class Palindrome {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
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

	// display
	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	// find middle
	public Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next; // +1
			fast = fast.next.next;// +2
		}
		return slow; // slow is my mid node
	}

	public boolean checkPalindrome() {
		if (head == null || head.next == null) {
			return true;
		}
		// step 1=find mid
		Node midNode = findMid(head);

		// step 2 =reverse 2nd half
		Node prev = null;
		Node curr = midNode;
		Node next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev; // right half head
		Node left = head;

		// step 3 =check left half & and right half
		while (right != null) {
			if (left.data != right.data) {
				return false;
			}
			left = right.next;
			right = right.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome ll = new Palindrome();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		

		ll.display();
		
		System.out.println();
		System.out.print(ll.checkPalindrome());
	}

}
