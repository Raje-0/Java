package Collection.queue;

import java.util.PriorityQueue;

public class Q2_Priority {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> i= new PriorityQueue<>();
		
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
