import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("1")) {
                stack.push(Integer.parseInt(command[1]));
            }
            if (command[0].equals("2")) {
                    stack.pop();
            }
            if (command[0].equals("3")) {
                if (stack.size()>0){
                    System.out.println(Collections.max(stack));
                }
            }
        }
    }
}
