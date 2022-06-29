package Collection.list;

import java.util.ArrayList;

public class L1_Arraylist {

	
		public static void main(String[] args) {

			ArrayList<Integer> list = new ArrayList<>(10);
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(0, 5);
			System.out.println(list);
			
			System.out.println(list.get(1));
			
			
		
	}

}
