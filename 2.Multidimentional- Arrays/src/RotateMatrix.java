import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateMatrix {
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

        if (degrees == 90) {
            rotateMatrix90(matrix, rows, cols);
        }
        if (degrees == 180) {
            rotateMatrix180(matrix, rows, cols);
        }
        if (degrees == 270) {
            rotateMatrix270(matrix, rows, cols);
        }

        if (degrees == 360 || degrees == 0) {
            printMatrix(matrix);
        }

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

    private static void rotateMatrix90(char[][] matrix, int rows, int cols) {
        int M = matrix.length;
        int N = matrix[0].length;
        char[][] rotatedMatrix = new char[N][M];

        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                rotatedMatrix[c][M - 1 - r] = matrix[r][c];
            }
        }
        printMatrix(rotatedMatrix);
    }

    private static void rotateMatrix180(char[][] matrix, int rows, int cols) {
        int M = matrix.length;
        int N = matrix[0].length;
        char[][] rotatedMatrix90 = new char[N][M];

        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                rotatedMatrix90[c][M - 1 - r] = matrix[r][c];
            }
        }

        int K = rotatedMatrix90.length;
        int L = rotatedMatrix90[0].length;
        char[][] rotatedMatrix180 = new char[L][K];

        for (int r = 0; r < K; r++) {
            for (int c = 0; c < L; c++) {
                rotatedMatrix180[c][K - 1 - r] = rotatedMatrix90[r][c];
            }
        }
        printMatrix(rotatedMatrix180);
    }

    private static void rotateMatrix270(char[][] matrix, int rows, int cols) {
        int M = matrix.length;
        int N = matrix[0].length;
        char[][] rotatedMatrix90 = new char[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                rotatedMatrix90[c][M - 1 - r] = matrix[r][c];
            }
        }

        int K = rotatedMatrix90.length;
        int L = rotatedMatrix90[0].length;
        char[][] rotatedMatrix180 = new char[L][K];
        for (int r = 0; r < K; r++) {
            for (int c = 0; c < L; c++) {
                rotatedMatrix180[c][K - 1 - r] = rotatedMatrix90[r][c];
            }
        }

        int F = rotatedMatrix180.length;
        int V = rotatedMatrix180[0].length;
        char[][] rotatedMatrix270 = new char[V][F];
        for (int r = 0; r < F; r++) {
            for (int c = 0; c < V; c++) {
                rotatedMatrix270[c][F - 1 - r] = rotatedMatrix180[r][c];
            }
        }
        printMatrix(rotatedMatrix270);
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
