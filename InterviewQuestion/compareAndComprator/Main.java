package compareAndComprator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*Comparable- single sorting like we have id and name then we can sort on the basic of one of them.
java.lang.
The compareTo method is defined in the Comparable interface, and it is used to implement
the natural ordering of objects.
Comparable is for the natural ordering of objects,*/
class Emp implements Comparable<Emp> {
	private int id;
	private String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getter methods for id and name

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	// Implement the compareTo method for sorting based on id
	@Override
	public int compareTo(Emp other) {
		return Integer.compare(this.id, other.id);
	}
}

/*---------------------------------------------------------------------*/
/*comparator- multiple sorting logic, 
java.util
The compare method is defined in the Comparator interface, and you can create multiple 
comparators for a class to support different sorting orders.
Comparator allows you to define custom ordering criteria.
 * 
 */
class Student {
	private int rollNumber;
	private String name;

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}

	// Constructor
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	// Getter methods
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}
}

// Comparator for sorting students based on their roll numbers
class RollNumberComparator implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getRollNumber(), student2.getRollNumber());
	}
}

/*----------------------------------------------------------------------------------------------*/

public class Main {

	public static void main(String[] args) {
		/*
		 * array sort -primitive 
		 * comparable and comparator for custom object sorting.
		 */
		// array sorting
		int arr[] = { 1, 2, 3, 4, 3, 5, 7, 5, 4, 85 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// collection sorting
		System.out.println();
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(3);
		arr1.add(9);
		arr1.add(1);
		arr1.add(2);
		Collections.sort(arr1);
		System.out.println(arr1);

		// comparable
		List<Emp> empList = new ArrayList<>();

		// Adding employees to the list
		empList.add(new Emp(3, "John"));
		empList.add(new Emp(1, "Alice"));
		empList.add(new Emp(2, "Bob"));

		// Sorting the list of employees using Collections.sort
		Collections.sort(empList);
		// Printing the sorted list
		System.out.println(empList);

		/*----------------------------------------------------------------------------*/
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Alice"));
		students.add(new Student(103, "Bob"));
		students.add(new Student(102, "Charlie"));

		// Sort students based on roll numbers using the RollNumberComparator
		Collections.sort(students, new RollNumberComparator());

		// Print the sorted students
		System.out.println(students);
	}

}
