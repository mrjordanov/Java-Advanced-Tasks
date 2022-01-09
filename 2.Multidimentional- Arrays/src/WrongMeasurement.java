import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(rows, scanner, " ");
        String[] input = scanner.nextLine().split(" ");
        int elementRow = Integer.parseInt(input[0]);
        int elementCol = Integer.parseInt(input[1]);

        int wrongValue = matrix[elementRow][elementCol];
        List<int[]> updatedValues=new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (wrongValue == matrix[row][col]) {
                    updatedValues.add(new int[] {row,col,getClosestItemsSum(row, col, matrix, wrongValue)});
                   // matrix[row][col] = getClosestItemsSum(row, col, matrix, wrongValue);
                }
            }
        }

        for (int[] updatedValue:updatedValues) {
            matrix[updatedValue[0]][updatedValue[1]]=updatedValue[2];
        }

        printMatrix(matrix);
    }

    private static int getClosestItemsSum(int row, int col, int[][] matrix,int wrongValue) {
        int sum = 0;

        if (col + 1 < matrix[row].length &&matrix[row][col + 1]!=wrongValue ) {
            sum += matrix[row][col + 1];
        }
        if (col - 1 >= 0 && matrix[row][col - 1]!=wrongValue ) {
            sum += matrix[row][col - 1];
        }
        if (row + 1 < matrix.length&& matrix[row + 1][col]!=wrongValue) {
            sum += matrix[row + 1][col];
        }
        if (row - 1 >= 0 &&matrix[row - 1][col]!=wrongValue ) {
            sum += matrix[row - 1][col];
        }

        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int rows, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(e -> Integer.parseInt(e)).toArray();
        }
        return matrix;
    }
}
