package a4_Pattern_Printing;

public class Hollow_Retangle {

	public static void hollow_rectangle(int toRow, int toCols) {
		// outer loop
		for (int i = 1; i <= toRow; i++) {
			// inner column
			for (int j = 1; j <= toCols; j++) {
				// cell-(i,j)
				if (i == 1 || i == toRow || j == 1 || j == toCols) {
					// Boundary cells
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hollow_rectangle(4, 7);
	}

}
