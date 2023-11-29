package l1_linkesList;

import java.util.LinkedList;

public class CollectionLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(0);
		System.out.println(ll);

		System.out.println(ll.size());
		
		ll.removeLast();
		ll.removeFirst();
		
		System.out.println(ll);
	}

}
