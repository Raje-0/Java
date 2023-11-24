package j3_SteamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*if we want to create a separate new object, for every object present in the collection based on our 
requirement then we should go for map() method of Stream interface.
 * 
 */
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();
		l.add("rvk");
		l.add("rk");
		l.add("rkv");
		l.add("rvki");
		l.add("rvkir");
		System.out.println(l);
		List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);

	}

}
