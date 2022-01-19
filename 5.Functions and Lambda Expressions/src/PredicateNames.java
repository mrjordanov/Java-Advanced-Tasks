import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfName = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        /*
        Function<List<String>, List<String>> filtered = list -> list.stream().filter(n -> n.length() <= lengthOfName).collect(Collectors.toList());
        (filtered.apply(names)).stream().forEach(e-> System.out.println(e));*/

        Predicate<String> checkName = name -> name.length() > lengthOfName;
        names.removeIf(checkName);
        names.forEach(e -> System.out.println(e));
    }
}
