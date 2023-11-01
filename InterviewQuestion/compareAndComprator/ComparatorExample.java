package compareAndComprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Comparable Interface:
The Comparable interface is used to define the natural ordering of objects. When a class implements the Comparable interface, it provides a way to compare its objects based on a default ordering. The compareTo() method is implemented in the class to define the comparison logic.

Here is an example to illustrate the usage of the Comparable interface:*/
//In summary, Comparable is used to define the natural ordering of objects, while Comparator is used to define custom comparison logic for objects. Both interfaces are useful for sorting collections of objects based on different criteria.


class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId() - s2.getId();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2, "John"));
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(3, "Bob"));

        Collections.sort(studentList, new IdComparator()); // Sorting based on the custom comparator logic

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}












