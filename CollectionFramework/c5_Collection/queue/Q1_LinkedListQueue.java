package c5_Collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1_LinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> i=new LinkedList<>();
		
		i.offer(2);
		i.offer(44);
		i.offer(6);
		i.offer(8);
		i.offer(1);
		
		System.out.println(i);
		
		System.out.println(i.poll());
		System.out.println(i);
		
		System.out.println(i.peek());
		

	}

}
