import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = rows;
        String pattern = input[1];
        int matrix[][] =new int[rows][cols];
        if (pattern.equals("A")){
            fillMatrixA(matrix);
        }
        if (pattern.equals("B")){
            fillMatrixB(matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(+matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixA(int[][] matrix) {
        int startNumber=1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] =startNumber++;
            }
        }
    }

    private static void fillMatrixB(int[][] matrix) {
        int startNumber=1;
        for (int col = 0; col < matrix.length ; col++) {
            if (col%2==0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] =startNumber++;
                }
            }
            else {
                for (int row = matrix.length-1; row >=0 ; row--) {
                    matrix[row][col] =startNumber++;
                }
            }
        }

    }

}
