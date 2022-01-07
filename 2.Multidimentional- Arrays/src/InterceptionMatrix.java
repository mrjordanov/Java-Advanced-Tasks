import java.util.Arrays;
import java.util.Scanner;

public class InterceptionMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix =  readMatrix(rows, cols, scanner);
        char[][] outputMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length ; row++) {
            for (int col = 0; col <cols ; col++) {
                char fillChar=firstMatrix[row][col]==secondMatrix[row][col] ? firstMatrix[row][col] : '*';
                outputMatrix[row][col]=fillChar;
            }
        }
        printMatrix (outputMatrix);

    }
    private static void printMatrix(char[][] outputMatrix) {
        for (int row = 0; row <outputMatrix.length ; row++) {
            for (int col = 0; col <outputMatrix[row].length ; col++) {
                System.out.print(outputMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            char[] arr = new char[elements.length];

            for (int i = 0; i < arr.length; i++) {
                char cur = elements[i].charAt(0);
                arr[i] = cur;
            }
            // char[] arrOne=line.replaceAll("\\s+","").toCharArray();
            matrix[row] = arr;//arrOne
        }
        return matrix;
    }
        // метод със splitpattern за разл разделители за 4-та задача SUM MATRIX ELEMENTS
    public static int[][] readMatrix(int rows, int cols, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
                matrix[row]= Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(Integer::parseInt)
                        .toArray();
        }
        return matrix;
    }



}
