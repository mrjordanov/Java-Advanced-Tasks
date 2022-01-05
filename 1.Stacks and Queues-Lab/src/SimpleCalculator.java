import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();


        String[] input = scanner.nextLine().split("\\s+");
        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }
        // for (String s:stack) {
        //     System.out.println(s);
        // }


        //добавяе на елементите в стека със колекция- Равносилно е на горния израз
        // с прочитане отзад на масива и даобавяне в стека
        // Collections.addAll(stack,input);
        // for (String s:stack) {
        // System.out.println(s);
        // }


        int result = 0;
        while (stack.size() > 1) {
            int left = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int right = Integer.parseInt(stack.pop());

            if (operation.equals("+")) {
                result = left + right;
            } else {
                result = left - right;
            }
            String push = "" + result;
            stack.push(push);
        }
        System.out.println(result);
    }
}
