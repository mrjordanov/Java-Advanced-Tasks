import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Map<String, Double>> shopsWithPrices = new TreeMap<>();

        while (!line.equals("Revision")) {
            String[] items = line.split(", ");
            String shop = items[0];
            String product = items[1];
            double price = Double.parseDouble(items[2]);

            shopsWithPrices.putIfAbsent(shop, new LinkedHashMap<>());
            Map<String, Double> productsAndPrices = shopsWithPrices.get(shop);
            productsAndPrices.put(product, price);

            line = scanner.nextLine();
        }

        for (String shop : shopsWithPrices.keySet()) {
            System.out.println(shop + "->");
            for (var entry : shopsWithPrices.get(shop).entrySet()) {
                System.out.println( String.format("Product: %s, Price: %.1f",entry.getKey(),entry.getValue()));
            }
        }
    }
}
