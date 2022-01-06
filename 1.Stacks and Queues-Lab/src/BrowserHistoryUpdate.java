import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> line = new ArrayDeque<>();
        ArrayDeque<String> navigation=new ArrayDeque<>();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (line.size()<=1){
                    System.out.println("no previous URLs");
                }
                else {
                    navigation.offer(line.pop());
                    System.out.println(line.peek());
                }
                input= scanner.nextLine();
                continue;
            }
            if (input.equals("forward")){
                if (navigation.isEmpty()){
                    System.out.println("no next URLs");
                    input= scanner.nextLine();
                    continue;
                }
                else {
                    System.out.println(navigation.peek());
                    navigation.clear();
                    input= scanner.nextLine();
                    continue;
                }
            }

            line.push(input);
            System.out.println(line.peek());
            input = scanner.nextLine();
        }
    }
}