import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];
        fillMatrix(matrix, scanner, " ");
        int sumOfPrimary = sumOfPrimaryDiagonal(matrix);
        int sumOfSecondary = sumOfSecondaryDiagonal(matrix);
        System.out.print(Math.abs(sumOfPrimary - sumOfSecondary));
    }

    private static int sumOfSecondaryDiagonal(int[][] matrix) {
        int row = matrix.length - 1;
        int col = 0;
        int sum = 0;
        while (row >= 0 && col < matrix.length) {
            int curElement = matrix[row][col];
            sum += curElement;
            row--;
            col++;
        }
        return sum;
    }

    private static int sumOfPrimaryDiagonal(int[][] matrix) {
        int row = 0;
        int col = 0;
        int sum = 0;
        while (row < matrix.length && col < matrix.length) {
            int currentElement = matrix[row][col];
            sum += currentElement;
            row++;
            col++;
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner, String splitPattern) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        }
    }
}
