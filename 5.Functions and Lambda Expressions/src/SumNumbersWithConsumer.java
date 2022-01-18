import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class SumNumbersWithConsumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Function<String, Integer> countNumbers = str -> str.split(", ").length;

        Function<String, Integer> sumOfNumbers = str -> Arrays.stream(str.split(", "))
                .mapToInt(Integer::parseInt).sum();

        Consumer<Integer> printCount = number -> System.out.println("Count = " + number);
        Consumer<Integer> printSum = number -> System.out.println("Sum = " + number);

        printCount.accept(countNumbers.apply(input));
        printSum.accept(sumOfNumbers.apply(input));


    }
}
