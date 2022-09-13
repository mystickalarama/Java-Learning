import java.util.Arrays;

public class Main {

    static void print(int[][] matrix) {
        for (int[] row: matrix) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int[][] matrixT = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }
        System.out.println("Matris: ");
        print(matrix);
        System.out.println("Matrisin Transpozu: ");
        print(matrixT);
    }
}
