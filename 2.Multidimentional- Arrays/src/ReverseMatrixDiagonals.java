import java.util.*;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
                matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        if (rows==0){
            return;
        }
        if (rows==1){
                for (int col =cols-1; col >=0 ;col--) {
                    System.out.println(matrix[0][col]);
                }
                return;
        }

        List<List<Integer>>numbers= new ArrayList<>();
        for (int k = 0; k <=rows-1 ; k++) {
            int i=k;
            int j=0;

            List<Integer> digits=new ArrayList<>();
            while (i>=0){
                digits.add(matrix[i][j]);
                i=i-1;
                j=j+1;
            }
            numbers.add(digits);
        }

        for (int k = 1; k <=cols-1 ; k++) {
            int i=rows-1;
            int j=k;

            List<Integer> digits=new ArrayList<>();
            while (j<=cols-1){
                digits.add(matrix[i][j]);
                i=i-1;
                j=j+1;
            }
            numbers.add(digits);
        }

        Collections.reverse(numbers);
        for (List number:numbers) {
            System.out.println(number.toString().replaceAll("[\\[\\],]",""));
        }
    }
}
