import java.util.Scanner;
import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<Вх.тип, Изходен тип> -> apply;
        Function<Integer, Integer> power2 = number -> number * number;
        System.out.println(power2.apply(5));

        //Consumer <Тип, който приема> -> accept;
        Consumer<String> printWord = word -> System.out.println(word);
        printWord.accept("Marin");

        //Supplier <Тип, който връща> -> get;
        Supplier<Integer> date = () -> 30;
        System.out.println(date.get());

        //Predicate<Tип, който приема> -> връща t/f -> test;
        Predicate<String> isEquals = word -> word.equals("Test");
        System.out.println(isEquals.test("test"));

        //BiFunction<1вх тип, 2вх.тип, Изх.тип> ->apply;
        BiFunction<Integer, Integer, String> sum = (number1, number2) -> String.valueOf(number1 + number2);
        System.out.println(sum.apply(5, 6));

    }
}
