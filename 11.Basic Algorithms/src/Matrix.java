import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = arr[0];
        int cols = arr[1];

        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            char[] arrs = line.toCharArray();
            matrix[r] = arrs;
        }

        char color = scanner.nextLine().charAt(0);
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();

        char oldColor = matrix[startRow][startCol];

        colorPlane(matrix, startRow, startCol, color, oldColor);
        printMatrix(matrix);
    }

    private static void colorPlane(char[][] matrix, int row, int col, char color, char oldColor) {
        if (isOutOfBounds(matrix, row, col)) {
            return;
        }
        if (matrix[row][col] != oldColor) {
            return;
        }
        matrix[row][col] = color;

        colorPlane(matrix, row - 1, col, color, oldColor);
        colorPlane(matrix, row + 1, col, color, oldColor);
        colorPlane(matrix, row, col + 1, color, oldColor);
        colorPlane(matrix, row, col - 1, color, oldColor);

    }

    private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] element : matrix) {
            for (char c : element) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
