import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        readAndFillMatrix(matrix, scanner, " ");

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] arg = command.split(" ");

            if (!arg[0].equals("swap")) {
                System.out.println("Invalid input!");
            }
            else if (arg.length!=5){
                System.out.println("Invalid input!");
            }
            else {
                int indexRow = Integer.parseInt(arg[1]);
                int indexOfCol = Integer.parseInt(arg[2]);
                int swapIndexRow = Integer.parseInt(arg[3]);
                int swapIndexCol = Integer.parseInt(arg[4]);

                if ((indexRow < 0 || indexRow > matrix.length) || ((swapIndexRow < 0 || swapIndexRow > matrix.length))) {
                    System.out.println("Invalid input!");
                } else if ((indexOfCol < 0 || indexOfCol > cols) || (swapIndexCol < 0 || swapIndexCol > cols)) {
                    System.out.println("Invalid input!");
                }
                else {
                    String cur=""+matrix[indexRow][indexOfCol];
                    matrix[indexRow][indexOfCol]= matrix[swapIndexRow][swapIndexCol];
                    matrix[swapIndexRow][swapIndexCol]=cur;
                    printCurMatrix(matrix);
                }
            }
            command = scanner.nextLine();
        }
    }

    private static void printCurMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void readAndFillMatrix(String[][] matrix, Scanner scanner, String splitPattern) {
        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split(splitPattern);
            int cols = line.length;
            matrix[row] = new String[cols];
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line[col];
            }
        }
    }
}
