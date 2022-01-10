import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossfireWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] arg = command.split(" ");
            int row = Integer.parseInt(arg[0]);
            int col = Integer.parseInt(arg[1]);
            int radius = Integer.parseInt(arg[2]);

            for (int rowToRemove = row - radius; rowToRemove <= row + radius; rowToRemove++) {
                if (isInMatrix(rowToRemove,col,matrix)) {//валидираме реда от който вземаме
                    matrix.get(rowToRemove).remove(col);
                }
            }
            for (int colToRemove = col + radius; colToRemove >=col - radius; colToRemove--) {
                if (isInMatrix(row,colToRemove,matrix)) {//валидираме колоната от която вземаме
                    matrix.get(row).remove(colToRemove);
                }
            }
            matrix.removeIf(List::isEmpty);
            command = scanner.nextLine();
        }
        printMatrix (matrix);
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>>matrix) {
        return row>=0 && row<matrix.size() && col>=0 && col<matrix.get(row).size();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row:matrix) {
            for (int element:row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int startNumber = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(startNumber++);
            }
        }
    }
}
