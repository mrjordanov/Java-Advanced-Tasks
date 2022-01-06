import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicOperationsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToPush = scanner.nextInt();
        int numbersToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbersToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }

        if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
