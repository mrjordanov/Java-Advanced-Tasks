import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(line[0]);

        int[][] matrix = readMatrix(rows, scanner, ", ");

        int maxSum=0;
        int[][] maxMatrix=new int[2][2];
        for (int r = 0; r < matrix.length-1 ; r++) {
            for (int c = 0; c <matrix[r].length-1 ; c++) {
                int current=matrix[r][c];
                int inRight=matrix[r][c+1];
                int inBottom=matrix[r+1][c];
                int leftRight=matrix[r+1][c+1];

                int currentSum= current+inRight+inBottom+leftRight;
                if (maxSum<currentSum){
                    maxSum=currentSum;
                    maxMatrix=new int[][]{
                            {current,inRight},
                            {inBottom,leftRight}
                    };
                }
            }
        }
           printMatrix(maxMatrix);
        System.out.println(maxSum);
    }

    private static int[][] readMatrix(int rows, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    private static void printMatrix(int[][] outputMatrix) {
        for (int row = 0; row < outputMatrix.length; row++) {
            for (int col = 0; col < outputMatrix[row].length; col++) {
                System.out.print(outputMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
