package j3_SteamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//To process objects of the collection,
/*f we want to represent a group of individual objects as a single entity then We should go for 
collection.
 If we want to process a group of objects from the collection then we should go for streams.
 We can create a stream object to the collection by using stream() method of Collection interface. 
stream() method is a default method added to the Collection in 1.8 version.
 * 
 */
public class Basic {
	public static void main(String[] args) {
ArrayList<Integer> l= new ArrayList<>();
l.add(1);
l.add(10);
l.add(4);
l.add(6);
l.add(25);
List<Integer> ll=l.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(ll);
	}
}
