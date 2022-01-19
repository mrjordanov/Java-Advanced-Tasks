import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* вариант 1:
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        //int min= Arrays.stream(numbers).min().getAsInt();
        Function<int[], Integer> getMin = array -> Arrays.stream(array).min().getAsInt();
        System.out.println(getMin.apply(numbers));
        */

        //вариант 2 с лист и функция:
        List<Integer> collect = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> findMin = list -> Collections.min(list);
        /* или в ламбда израза:
        list -> list.stream().mapToInt(Integer::intValue).min().getAsInt();*/
        System.out.print(findMin.apply(collect));

        /*вар 3 с лист и Consumer:
        List<Integer> collect = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Consumer<List<Integer>> printMin= list-> System.out.println(Collections.min(list));
        printMin.accept(collect);
        */
    }
}
