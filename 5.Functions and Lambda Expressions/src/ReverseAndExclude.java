import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        Function<List<Integer>, List<Integer>> getList = list -> list.stream().filter(e -> e % n != 0).collect(Collectors.toList());
        numbers = getList.apply(numbers);

        Collections.reverse(numbers);
        List<String> collect = numbers.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.print(String.join(" ", collect));
    }
}
