package twoDarray;

public class A3_SpiralMatrix {
	
    public static void printSpiralMatrix(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1, startColumn = 0, endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Print top row
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;

            // Print right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }
            endColumn--;

            // Print bottom row (if exists)
            if (startRow <= endRow) {
                for (int i = endColumn; i >= startColumn; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }

            // Print left column (if exists)
            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startColumn] + " ");
                }
                startColumn++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printSpiralMatrix(matrix);
    }


}
