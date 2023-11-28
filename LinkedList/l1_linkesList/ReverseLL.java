package l1_linkesList;

public class ReverseLL {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static class Linkedlist {
		Node head = null;
		Node tail = null;
		int size = 0;

		// add at end
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

		// display
		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}
		
	public 	void reverse() {
			Node prev=null;
			Node curr=tail=head;
			Node next;
			
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				prev= curr;
				curr=next;
			}
			head=prev;
		}
	}

	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);

		ll.display();
		
		System.out.println();
		ll.reverse();
		ll.display();
	}

}
