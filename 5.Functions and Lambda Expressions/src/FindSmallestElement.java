import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        // int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        int min = Collections.min(numbers);
        Function<List<Integer>, Integer> indexOf = list -> list.lastIndexOf(min);
        System.out.print(indexOf.apply(numbers));
    }
}
