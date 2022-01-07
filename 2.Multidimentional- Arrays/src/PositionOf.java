import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols =  Integer.parseInt(input[1]);

        int[][] matrix = readMatrix(rows, cols, scanner);
        int number = Integer.parseInt(scanner.nextLine());

       ArrayList<int[]> indexes= new ArrayList<>();

       // boolean isFound=false;
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                if (number==matrix[row][col]){
                   int[] foundAt={row,col};
                   indexes.add(foundAt);
                     //   isFound=true;
                  //  System.out.printf("%d %d",row,col).println();
                }
            }
        }

        if (indexes.isEmpty()){
        System.out.println("not found");
       }
        else {
            String output=indexes.stream().map(arr->arr[0]+" "+arr[1]).collect(Collectors.joining(System.lineSeparator()));
            System.out.println(output);
          //  for (int[] index:indexes) {
            //    System.out.println(index[0] + " "+index[1]);
            //}
        }
      //  if (!isFound){
          //  System.out.println("not found");
       // }
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
