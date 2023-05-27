package a4_Pattern_Printing;

public class Floyds_Triangle {
	public static void floys_triangle(int n) {
		// outer
		int counter = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
floys_triangle(6);
	}

}
