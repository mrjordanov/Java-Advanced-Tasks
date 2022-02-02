import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        int cols = rows;
        String[][] emptyMatrix = new String[rows][];
        String[][] matrix = fillMatrix(scanner, emptyMatrix);

        int[] startIndex = getStartIndex(matrix);
        List<int[]> foodIndexes = getFoodIndexes(matrix);
        List<int[]> enemiesIndexes = getEnemiesIndexes(matrix);


        int eatenFood = 0;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            int curRowIndex = startIndex[0];
            int curColIndex = startIndex[1];
            if (command.equals("up")) {
                curRowIndex = startIndex[0] - 1;
                if (curRowIndex < 0) {
                    curRowIndex = cols - 1;
                }
                if (isEnemiesIndexHere(curRowIndex, curColIndex, enemiesIndexes)) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }
                if (isFoodIndexHere(curRowIndex, curColIndex, foodIndexes)) {
                    eatenFood++;
                    if (eatenFood == foodIndexes.size()) {
                        System.out.println("You win! Final python length is " + (eatenFood + 1));
                        return;
                    }
                }
            }
            if (command.equals("down")) {
                curRowIndex = startIndex[0] + 1;
                if (curRowIndex >= cols) {
                    curRowIndex = 0;

                }
                if (isEnemiesIndexHere(curRowIndex, curColIndex, enemiesIndexes)) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }
                if (isFoodIndexHere(curRowIndex, curColIndex, foodIndexes)) {
                    eatenFood++;
                    if (eatenFood == foodIndexes.size()) {
                        System.out.println("You win! Final python length is " + (eatenFood + 1));
                        return;
                    }
                }
            }
            if (command.equals("left")) {
                curColIndex = startIndex[1] - 1;
                if (curColIndex < 0) {
                    curColIndex = rows - 1;

                }
                if (isEnemiesIndexHere(curRowIndex, curColIndex, enemiesIndexes)) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }
                if (isFoodIndexHere(curRowIndex, curColIndex, foodIndexes)) {
                    eatenFood++;
                    if (eatenFood == foodIndexes.size()) {
                        System.out.println("You win! Final python length is " + (eatenFood + 1));
                        return;
                    }
                }
            }
            if (command.equals("right")) {
                curColIndex = startIndex[1] + 1;
                if (curColIndex >= rows) {
                    curColIndex = 0;

                }
                if (isEnemiesIndexHere(curRowIndex, curColIndex, enemiesIndexes)) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }
                if (isFoodIndexHere(curRowIndex, curColIndex, foodIndexes)) {
                    eatenFood++;
                    if (eatenFood == foodIndexes.size()) {
                        System.out.println("You win! Final python length is " + (eatenFood + 1));
                        return;
                    }
                }
            }

            startIndex[0] = curRowIndex;
            startIndex[1] = curColIndex;
        }

        int leftFood = foodIndexes.size() - eatenFood;
        System.out.printf("You lose! There is still %d food to be eaten.", leftFood);

    }

    private static boolean isFoodIndexHere(int curRowIndex, int curColIndex, List<int[]> foodIndexes) {
        for (int[] elements : foodIndexes) {
            if (elements[0] == curRowIndex && elements[1] == curColIndex) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEnemiesIndexHere(int curRowIndex, int curColIndex, List<int[]> enemiesIndexes) {
        for (int[] elements : enemiesIndexes) {
            if (elements[0] == curRowIndex && elements[1] == curColIndex) {
                return true;
            }
        }
        return false;
    }

    private static List<int[]> getEnemiesIndexes(String[][] matrix) {
        List<int[]> indexes = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col].equals("e")) {
                    indexes.add(new int[]{row, col});
                }
            }
        }
        return indexes;
    }

    private static List<int[]> getFoodIndexes(String[][] matrix) {
        List<int[]> indexes = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("f")) {
                    indexes.add(new int[]{row, col});
                }
            }
        }
        return indexes;
    }

    private static int[] getStartIndex(String[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("s")) {
                    startRow = row;
                    startCol = col;
                }
            }
        }
        return new int[]{startRow, startCol};
    }

    public static String[][] fillMatrix(Scanner scanner, String[][] matrix) {

        for (int rows = 0; rows < matrix.length; rows++) {
            String[] arr = scanner.nextLine().split(" ");
            matrix[rows] = arr;
        }
        return matrix;
    }

    private static void printMatrix(String[][] filledMatrix) {
        for (int rows = 0; rows < filledMatrix.length; rows++) {
            for (int cols = 0; cols < filledMatrix[rows].length; cols++) {
                System.out.print(filledMatrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }

}
