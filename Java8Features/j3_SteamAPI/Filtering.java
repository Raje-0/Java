package j3_SteamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*We can configure a filter to filter elements from the collection based on some boolean condition by 
using filter()method of Stream interface.
 * 
 */
//Ex 1: To collect only even numbers from the array list
public class Filtering {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
