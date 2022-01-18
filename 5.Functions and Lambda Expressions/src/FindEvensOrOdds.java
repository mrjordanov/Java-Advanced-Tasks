import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        String command = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (int i = startNumber; i <= endNumber; i++) {
            numbers.add(i);
        }

        List<Integer> filter = getFilter(command, numbers);
        List<String> collect = filter.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.print(String.join(" ", collect));
    }

    private static List<Integer> getFilter(String command, List<Integer> numbers) {
        if (command.equals("even")) {
            return numbers.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        } else {
            return numbers.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
        }
    }
}
