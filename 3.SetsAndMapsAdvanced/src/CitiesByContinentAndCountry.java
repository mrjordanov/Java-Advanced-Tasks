import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedHashMap<String, LinkedList<String>>> information = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] arg = line.split(" ");
            String continent = arg[0];
            String land = arg[1];
            String city = arg[2];

            information.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, LinkedList<String>> country = information.get(continent);
            country.putIfAbsent(land, new LinkedList<>());
            LinkedList<String> cities = country.get(land);
            cities.add(city);
        }

        information.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey() + ":");
                    e.getValue().entrySet().stream()
                            .forEach(ie -> {
                                System.out.println("  " + ie.getKey() + " -> " + String.join(", ", ie.getValue()));
                            });
                });
    }
}
