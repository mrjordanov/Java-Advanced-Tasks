import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        Set<String> elements= new TreeSet<>();

        for (int i = 0; i <n ; i++) {
            String[] input= scanner.nextLine().split("\\s+");
                /* вар.1 обхождам масива и добавям в сета
            for (int j = 0; j < input.length ; j++) {
                    elements.add(input[j]);
            }
             2вар: добавям вс. ел. на масива в сета, като го превръща в колекция;
            Collections.addAll(elements,input);*/

            elements.addAll(Arrays.asList(input));
        }


        for (String s:elements) {
            System.out.print(s+" ");
        }

    }
}
