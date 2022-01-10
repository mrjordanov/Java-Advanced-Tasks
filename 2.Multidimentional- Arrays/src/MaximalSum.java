import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner, " ");

        findAndPrintMaxSubMatrixWithSum(matrix);
    }

    private static void findAndPrintMaxSubMatrixWithSum(int[][] matrix) {
        int maxSum=0;
        int[][] maxMatrix= new int[3][3];
        for (int row = 1; row <matrix.length-1; row++) {
            for (int col = 1; col <matrix[row].length-1; col++) {
                int a=matrix[row][col];
                int b=matrix[row-1][col-1];
                int c=matrix[row-1][col];
                int d=matrix[row-1][col+1];
                int e=matrix[row][col-1];
                int f=matrix[row][col+1];
                int g=matrix[row+1][col-1];
                int h= matrix[row+1][col];
                int j=matrix[row+1][col+1];

                int curSum=a+b+c+d+e+f+g+h+j;
                if (maxSum<curSum){
                    maxSum=curSum;
                    maxMatrix=new int[][]{
                            {b,c,d},
                            {e,a,f},
                            {g,h,j}
                    };
                }
            }
        }

        System.out.println("Sum = "+maxSum);
        for (int row = 0; row <maxMatrix.length ; row++) {
            for (int col = 0; col <maxMatrix[row].length ; col++) {
                System.out.print(maxMatrix[row][col]+" ");
            }
            System.out.println();
        }
       // printMaxMatrix(maxMatrix);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner, String splitPattern) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        }
    }
}
