import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int[][] arrayMatrix= {
       //         {1,2,3},
       //         {13,42,67},
       //         {73,69,53}
       // };

      //  for (int row = 0; row < arrayMatrix.length ; row++) {
       //     for (int col = 0; col <arrayMatrix[0].length ; col++) {
        //        System.out.printf("%d ",arrayMatrix[row][col]);
        //    }
          //  System.out.println();
      //  }

        int rows=3;
        int columns=3;
       // int[][] matrix= new int[rows][columns];

      //  for (int row = 0; row <rows ; row++) {
          //  int[] arr= Arrays.stream(scanner.nextLine().split(", "))
          //          .mapToInt(e-> Integer.parseInt(e))
           //         .toArray();
          //  matrix[row]=arr;
      //  }
      //  System.out.println();

        int[][] matrix= readMatrix(rows,columns,scanner);
    }

    public  static  int[][] readMatrix(int rows, int columns, Scanner scanner){
        int[][] matrix= new int[rows][columns];

        for (int row = 0; row <rows ; row++) {
          String[] elements=scanner.nextLine().split(", ");
            for (int col = 0; col <columns ; col++) {
                matrix[row][col]=Integer.parseInt(elements[col]);
            }
        }
        return  matrix;
    }
}
