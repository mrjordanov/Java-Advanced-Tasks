import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVatV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        UnaryOperator<Double> vatCalculator = val -> val * 1.2;
        System.out.println("Prices with VAT:");
        Arrays.stream(input.split(", "))
                .map(Double::parseDouble)
                .map(vatCalculator)
                .forEach(e -> System.out.printf("%.2f", e).println());
    }
}
