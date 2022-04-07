import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashSet<String>> playersCards = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String[] arg = input.split(": ");
            String name = arg[0];
            String[] typeOfCards = arg[1].split(", ");
            playersCards.putIfAbsent(name, new LinkedHashSet<>());
            LinkedHashSet<String> cards = playersCards.get(name);
            cards.addAll(Arrays.asList(typeOfCards));

            input = scanner.nextLine();
        }

        playersCards.entrySet().forEach(entry -> {
            String name = entry.getKey();
            int points = getCardPoints(entry.getValue());
            System.out.printf("%s: %d%n", name, points);

        });

    }

    private static int getCardPoints(LinkedHashSet<String> value) {
        Map<Character, Integer> pointsMap = getCardValue();
        int sum = 0;
        for (String card : value) {
            int points;
            if (card.contains("10")) {
                char type = card.charAt(2);
                points=10*pointsMap.get(type);

            } else {
                char number = card.charAt(0);
                char type = card.charAt(1);
                points=pointsMap.get(number)*pointsMap.get(type);
            }
            sum+=points;
        }
        return  sum;
    }

    private static Map<Character, Integer> getCardValue() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}
