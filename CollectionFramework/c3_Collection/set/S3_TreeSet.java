package c3_Collection.set;

import java.util.Set;
import java.util.TreeSet;

public class S3_TreeSet {

	public static void main(String[] args) {
		
Set<Integer> tree = new TreeSet<>();
	
tree.add(8);
tree.add(2);
tree.add(3);
tree.add(6);
tree.add(5);
System.out.println(tree);

tree.remove(1);
System.out.println(tree);

System.out.println(tree.contains(7));

System.out.println(tree.size());
	}

}
