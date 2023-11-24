package c5_Collection.queue;

import java.util.ArrayDeque;

public class Q3_ArrayDeque {

	public static void main(String[] args) {

		ArrayDeque<Integer> d = new ArrayDeque<>();
		d.offer(5);
		d.offer(3);
		d.offer(7);
		d.offer(9);
		d.offer(2);
		
	System.out.println(d);
		
		d.offerFirst(20);
		d.offerLast(10);
		System.out.println(d);
		
		

		
	}

}
