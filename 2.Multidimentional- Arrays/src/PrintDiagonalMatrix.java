import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(size, scanner, "\\s+");

        int row = 0;
        int col = 0;
        while (row < size && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();
         row=size-1;
         col=0;
        while (row>= 0 && col<size){
           int current=matrix[row][col];
          System.out.print(current+" ");
          row--;
          col++;
        }
    }

    private static int[][] readMatrix(int size, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[size][];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

}
