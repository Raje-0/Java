package a6_Array;

public class A5_Array_as_a_Argument {
	public static void update(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = { 1, 2, 3, 4, 5 };
		update(marks);
		for (int k : marks) {
			System.out.print(k); // enhance for -loop
		}

	}
}