import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        Function<int[], int[]> add = array -> Arrays.stream(array).map(number -> number += 1).toArray();
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(number -> number *= 2).toArray();
        Consumer<int[]> print = array -> Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(number -> number -= 1).toArray();

        while (!command.equals("end")) {
            if (command.equals("add")) {
                numbers = add.apply(numbers);
            }
            if (command.equals("multiply")) {
                numbers = multiply.apply(numbers);
            }
            if (command.equals("print")) {
                print.accept(numbers);
                System.out.println();
            }
            if (command.equals("subtract")) {
                numbers = subtract.apply(numbers);
            }
            command = scanner.nextLine();
        }

    }
}
