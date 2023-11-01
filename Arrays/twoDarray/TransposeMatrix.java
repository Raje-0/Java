package twoDarray;

public class TransposeMatrix {
	public static int[][] transpose(int[][] matrix, int r, int c) {
		int[][] transpose = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}

		return transpose;
	}

	public static void main(String[] args) {

	}

}
