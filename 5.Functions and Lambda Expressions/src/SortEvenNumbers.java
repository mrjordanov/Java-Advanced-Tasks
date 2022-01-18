import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String input = scanner.nextLine();
        String[] arr = input.split(", ");
        List<String> add = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        List<Integer> digits = add.stream().map(Integer::parseInt).collect(Collectors.toList());*/

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0).collect(Collectors.toList());

        // Function<Stream<Integer>,String> mutator= x->x.map(String::valueOf).collect(Collectors.joining(", "));
        String firstOutput = evenNumbers.stream()
                .map(String::valueOf).collect(Collectors.joining(", "));
        // String firstOutput=mutator.apply(evenNumbers.stream());
        System.out.println(firstOutput);

        String sorted = evenNumbers.stream().sorted()
                .map(String::valueOf).collect(Collectors.joining(", "));
        //String sorted=mutator.apply(evenNumbers.stream().sorted());
        System.out.println(sorted);
    }
}
