import java.sql.Array;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            /*1вар
        String[] integers = scanner.nextLine().split(", ");

        int sum = Arrays.stream(integers).mapToInt(Integer::parseInt).sum();
        long count = Arrays.stream(integers).mapToInt(Integer::parseInt).count();
        System.out.println("Count = "+count);
        System.out.println("Sum = "+sum);
             */

        String input= scanner.nextLine();
        Function<String,Integer> countNumbers= str-> str.split(", ").length;

        Function<String,Integer> sumOfNumbers= str->Arrays.stream(str.split(", "))
                .mapToInt(Integer::parseInt).sum();


        System.out.println("Count = "+countNumbers.apply(input));
        System.out.println("Sum = "+sumOfNumbers.apply(input));
    }
}
