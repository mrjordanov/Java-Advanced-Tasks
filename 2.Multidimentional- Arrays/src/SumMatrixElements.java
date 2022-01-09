import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix= readMatrix (rows,scanner, ", ");
        int sum= sumOfMatrixElements(matrix);

        System.out.println(+rows);
        System.out.println(+cols);
        System.out.print(sum);
    }

    private static int sumOfMatrixElements(int[][] matrix) {
        int sum=0;
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                sum+=matrix[row][col];
            }
        }
        return sum;
    }

    private static int[][] readMatrix(int rows, Scanner scanner, String splitPattern) {
        int[][] matrix=new int[rows][];

        for (int row = 0; row < matrix.length ; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(e-> Integer.parseInt(e)).toArray();
        }
        return matrix;
    }
}
