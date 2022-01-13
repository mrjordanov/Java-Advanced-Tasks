import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, LinkedHashMap<String, Integer>> countries = new LinkedHashMap<>();

        while (!input.equals("report")) {
            String[] arg = input.split("\\|");
            String town = arg[0];
            String land = arg[1];
            int population = Integer.parseInt(arg[2]);

            countries.putIfAbsent(land, new LinkedHashMap<>());
            LinkedHashMap<String, Integer> cities = countries.get(land);
            cities.putIfAbsent(town,population);

            input = scanner.nextLine();
        }



    }
}
