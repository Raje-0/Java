package priorityQueue;

import java.util.PriorityQueue;

class Student implements Comparable<Student> {
	private String name;
	private int rank;

	public Student(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public int compareTo(Student s2) {
		return this.rank-s2.rank;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", rank=" + rank + '}';
	}
}

public class PriorityQueuesWithObjects {
	public static void main(String[] args) {
		  PriorityQueue<Student> studentQueue = new PriorityQueue<>();

	        Student s1 = new Student("Alice", 3);
	        Student s2 = new Student("Bob", 1);
	        Student s3 = new Student("Charlie", 2);

	        studentQueue.add(s1);
	        studentQueue.add(s2);
	        studentQueue.add(s3);

	        System.out.println("Students in Priority Queue:");

	        while (!studentQueue.isEmpty()) {
	            System.out.println(studentQueue.poll());
		}
	}
}
