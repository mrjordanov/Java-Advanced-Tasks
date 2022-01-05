import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        String current = null;
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!history.isEmpty()) {
                    current = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    input= scanner.nextLine();
                    continue;
                }
            } else {
                if (current != null) {
                    history.push(current);
                }
                current = input;
            }
            System.out.println(current);
            input = scanner.nextLine();
        }
    }
}
