package dsa1_Search;

public class Linear_Search {
	public static int seach(int marks[], int target) {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == target) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = { 1, 3, 55, 67, 8, 9, 7, 66 };
		int target = 55;
		System.out.println(seach(marks, target));

		int index = seach(marks, target);
		System.out.println("your target is at index no " + index);
	}

}
