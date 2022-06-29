package Collectionn;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5,6,7,8,9};
		int index= Arrays.binarySearch(num, 4);
		
		System.out.println("the index of element 4 in the array is :" +index);
 
		
	}

}
