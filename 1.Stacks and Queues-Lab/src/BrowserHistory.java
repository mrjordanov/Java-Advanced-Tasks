import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> line = new ArrayDeque<>();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (line.size()==1){
                    System.out.println("no previous URLs");
                }
                else {
                    line.pop();
                    System.out.println(line.peek());
                }
                input= scanner.nextLine();
                continue;
            }
            line.push(input);
            System.out.println(line.peek());
            input = scanner.nextLine();
        }
    }
}
