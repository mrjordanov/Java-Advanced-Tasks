
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];

        fillMatrix(rows, cols, matrix);
        String line = scanner.nextLine();
        while (!line.equals("Nuke it from orbit")) {
            String[] arg = line.split(" ");
            int row = Integer.parseInt(arg[0]);
            int col = Integer.parseInt(arg[1]);
            int radius = Integer.parseInt(arg[2]);

            for (int rowToRemove = row - radius; rowToRemove <= row+ radius; rowToRemove++) {
                if (rowToRemove >= 0 && rowToRemove < rows) {
                    matrix[rowToRemove][col] = 0;
                }
                for (int colToRemove = col - radius; colToRemove <= col + radius; colToRemove++) {
                    if (colToRemove >= 0 && colToRemove < cols) {
                        matrix[row][colToRemove] = 0;
                    }
                }
            }
           // removeAllZeroElements(matrix,rows);
            printMatrix(matrix);
            line = scanner.nextLine();
        }


    }

  //  private static void removeAllZeroElements(int[][] matrix, int rows) {
       // for (int row = 0; row <rows ; row++) {
         //   int[] currRowArray=matrix[row];
           // for (int i = 0; i <currRowArray.length ; i++) {
              //  if (currRowArray[i]==0){
               //     for (int j = 0; j < currRowArray.length-1 ; j++) {
                //        currRowArray[j]=currRowArray[j+1];
                //    }
               //  //   break;
              //  }
         //   }
          //  matrix[row]=currRowArray;
       // }
  //  }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        int startNumber = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = startNumber++;
            }
        }
    }
}
