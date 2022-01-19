import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Consumer <Тип, който приема> -> accept;
        Consumer<String> printWord = word -> System.out.println(word);
        printWord.accept("Marin");
                */
        /* 1вар
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String> printName= name-> System.out.println(name);
        for (int i = 0; i < names.length ; i++) {
                printName.accept(names[i]);
        }
        */
        /* 2вар
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String[]> printNames= array-> {
            for (String name:array) {
                System.out.println(name);
            }
        };
        printNames.accept(names);*/

        List<String> collect = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Consumer<String> consumer = word -> System.out.println(word);
        collect.stream().forEach(consumer);

    }
}
