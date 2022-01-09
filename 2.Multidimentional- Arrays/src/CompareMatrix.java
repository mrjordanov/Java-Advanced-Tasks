import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows=  Integer.parseInt(scanner.nextLine().split("\\s+")[0]);
        int[][] firstMatrix= readMatrix(rows,scanner);

        rows=Integer.parseInt(scanner.nextLine().split("\\s+")[0]);
        int[][] secondMatrix=readMatrix(rows,scanner);

        boolean areEqual= areEqual(firstMatrix,secondMatrix);

        //тернарен оператор трябва да е нещо, което връща true/false
        // : ако areEqual върне true отпечатай equal, в противен случай not equal;
        String output=areEqual ? "equal": "not equal";

        System.out.println(output);
    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length!= secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length ; row++) {
            int[] firstArr=firstMatrix[row];
            int[] secondArr=secondMatrix[row];

            if (firstArr.length!= secondArr.length){
                return false;
            }

            for (int index = 0; index < firstArr.length ; index++) {
                    if (firstArr[index]!=secondArr[index]){
                        return false;
                    }
            }
        }
         return  true;
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix= new int[rows][];

        for (int row = 0; row <rows ; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e->Integer.parseInt(e)).toArray();
        }
            return  matrix;
    }
}
