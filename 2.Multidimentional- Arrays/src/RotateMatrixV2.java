import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateMatrixV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstIndex = command.indexOf("(");
        int lastIndex = command.lastIndexOf(")");
        String rotation = command.substring(firstIndex + 1, lastIndex);
        int degrees = Integer.parseInt(rotation);

        List<String> words = new ArrayList<>();
        int rows = findRowsOfTheMatrix(words, scanner);
        int cols = findColumnsOfTheMatrix(words);

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String current = words.get(row);
            String[] elements = current.split("");
            char[] arr = new char[cols];
            for (int i = 0; i < arr.length; i++) {
                if (i >= elements.length) {
                    char cur = ' ';
                    arr[i] = cur;
                } else {
                    char cur = elements[i].charAt(0);
                    arr[i] = cur;
                }
            }
            matrix[row] = arr;
        }

        int count=degrees/90;

        char[][] current=matrix;
        for (int i = 1; i <=count ; i++) {
            char[][] cur = rotateMatrix90(current, rows, cols);
            current=cur;
        }

        printMatrix(current);
    }

    private static int findColumnsOfTheMatrix(List<String> words) {
        int maxSizeOfWord = 0;
        for (int i = 0; i < words.size(); i++) {
            int curLength = words.get(i).length();
            if (curLength > maxSizeOfWord) {
                maxSizeOfWord = curLength;
            }
        }
        return maxSizeOfWord;
    }

    private static int findRowsOfTheMatrix(List<String> words, Scanner scanner) {
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            words.add(input);
            input = scanner.nextLine();
        }

        return words.size();
    }

    private static char[][] rotateMatrix90(char[][] matrix, int rows, int cols) {
        int M = matrix.length;
        int N = matrix[0].length;
        char[][] rotatedMatrix = new char[N][M];

        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                rotatedMatrix[c][M - 1 - r] = matrix[r][c];
            }
        }
       return rotatedMatrix;
    }

    private static void printMatrix(char[][] rotatedMatrix) {
        for (int r = 0; r < rotatedMatrix.length; r++) {
            for (int c = 0; c < rotatedMatrix[r].length; c++) {
                System.out.print(rotatedMatrix[r][c]);
            }
            System.out.println();
        }
    }
}
