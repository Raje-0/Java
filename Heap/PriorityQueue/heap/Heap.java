package heap;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> arr = new ArrayList<>();

	public void add(int data) { // 0(logn)
		// add at last index
		arr.add(data);

		int x = arr.size() - 1; // x is child index

		int par = (x - 1) / 2; // par index

		while (arr.get(x) < arr.get(par)) {
			// swap
			int temp = arr.get(x);
			arr.set(x, arr.get(par));
			arr.set(par, temp);
		}
	}

	public int peek() {
		return arr.get(0);
	}

	private void heapify(int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int minIdx = i;

		if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
			minIdx = left;
		}

		if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
			minIdx = right;
		}

		if (minIdx != i) {
			// swap
			int temp = arr.get(i);
			arr.set(i, arr.get(minIdx));
			arr.set(minIdx, temp);

			heapify(minIdx);

		}
	}

	public int remove() {
		int data = arr.get(0);

		// step1 = swap 1st and last
		int temp = arr.get(0);
		arr.set(0, arr.size() - 1);
		arr.set(arr.size() - 1, temp);

		// step 2= heapify
		heapify(0);
		return data;
	}

	public boolean isEmpty() {
		return arr.size() == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Heap h = new Heap();
h.add(3);
h.add(4);
h.add(1);
h.add(5);
h.add(7);

//while(!h.isEmpty()) {
//	System.out.println(h.peek());
//	h.remove();
//}

	}

}
