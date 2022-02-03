import java.util.Scanner;

public class PresentDelivery {
    static int sRow = 0;
    static int sCol = 0;
    static int niceKidsCount = 0;
    static int presents;
    static int niceKidsWithPresents = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        presents = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());


        char[][] matrix = new char[size][size];

        for (int r = 0; r < matrix.length; r++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            if (line.contains("S")) {
                sRow = r;
                sCol = line.indexOf("S");
            }
            char[] arr = line.toCharArray();
            matrix[r] = arr;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'V') {
                    niceKidsCount++;
                }
            }
        }


        String command = scanner.nextLine();
        while (!command.equals("Christmas morning")) {
            matrix[sRow][sCol] = '-';
            if (command.equals("up")) {
                moveSanta(sRow - 1, sCol, matrix);
                if (isNoMorePresents(presents)) {
                    break;
                }

            }
            if (command.equals("down")) {
                moveSanta(sRow + 1, sCol, matrix);
                if (isNoMorePresents(presents)) {
                    break;
                }

            }
            if (command.equals("left")) {
                moveSanta(sRow, sCol - 1, matrix);
                if (isNoMorePresents(presents)) {
                    break;
                }

            }
            if (command.equals("right")) {
                moveSanta(sRow, sCol + 1, matrix);
                if (isNoMorePresents(presents)) {
                    break;
                }
            }
            command = scanner.nextLine();
        }

        if (isNoMorePresents(presents)) {
            System.out.println("Santa ran out of presents!");
        }
        matrix[sRow][sCol] = 'S';
        printMatrix(matrix);

        if (niceKidsWithPresents == niceKidsCount) {
            System.out.printf("Good job, Santa! %d happy nice kid/s.", niceKidsCount);
        } else {
            int diff = niceKidsCount - niceKidsWithPresents;
            System.out.printf("No presents for %d nice kid/s.", diff);
        }
    }

    private static boolean isNoMorePresents(int presents) {
        if (presents <= 0) {
            return true;
        }
        return false;
    }

    private static void moveSanta(int newRol, int newCol, char[][] matrix) {
        int[] newIndexes = new int[]{newRol, newCol};

        if (matrix[newRol][newCol] == 'V') {
            presents--;
            niceKidsWithPresents++;
            matrix[newRol][newCol] = '-';
        }
        if (matrix[newRol][newCol] == 'X') {
            matrix[newRol][newCol] = '-';
        }
        if (matrix[newRol][newCol] == 'C') {
            presents = isThereKidsAround(newRol, newCol, matrix);
        }

        sRow = newIndexes[0];
        sCol = newIndexes[1];
    }


    private static int isThereKidsAround(int r, int c, char[][] matrix) {
        if (matrix[r - 1][c] == 'V') {
            presents--;
            niceKidsWithPresents++;

        } else if (matrix[r - 1][c] == 'X') {
            presents--;
        } else if (matrix[r + 1][c] == 'V') {
            presents--;
            niceKidsWithPresents++;
        } else if (matrix[r + 1][c] == 'X') {
            presents--;
        } else if (matrix[r][c - 1] == 'V') {
            presents--;
            niceKidsWithPresents++;
        } else if (matrix[r][c - 1] == 'X') {
            presents--;
        } else if (matrix[r][c + 1] == 'V') {
            presents--;
            niceKidsWithPresents++;
        } else if (matrix[r][c + 1] == 'X') {
            presents--;
        }
        return presents;
    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
