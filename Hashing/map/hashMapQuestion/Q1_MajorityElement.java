package map.hashMapQuestion;

import java.util.HashMap;
import java.util.Set;

public class Q1_MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 1, 3, 1, 5, 1 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i] + 1));
			} else {
				map.put(arr[i], 1);
			}
		}
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			if (map.get(key) > arr.length / 3) {
				System.out.println(key);
			}
		}
	}

}
