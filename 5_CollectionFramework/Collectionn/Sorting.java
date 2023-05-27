package Collectionn;

import java.util.ArrayList;

import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(8);
		num.add(9);
		num.add(12);
		num.add(0);
		
		Collections.sort(num);
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println(num);
		
		Collections.max(num);
		System.out.println(num);

	}

}
