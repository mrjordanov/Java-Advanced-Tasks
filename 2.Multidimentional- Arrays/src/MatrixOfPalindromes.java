import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix= new String[rows][cols];
        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix) {
        char first='a';
        for (int row = 0; row < matrix.length; row++) {
            char middle=first;
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] =String.format("%c%c%c",first,middle,first);
                middle++;
            }
            first++;
        }
    }
}
