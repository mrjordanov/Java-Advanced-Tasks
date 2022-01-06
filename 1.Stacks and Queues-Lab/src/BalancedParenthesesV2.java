import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();


        boolean areBalanced = false;

        if (input.length() % 2 != 0) {
            areBalanced = false;
        } else {
            for (int i = 0; i < input.length(); i++) {
                char cur = input.charAt(i);
                if (cur == '(' || cur == '{' || cur == '[') {
                    stack.push(cur);
                }
                if (cur == ')' || cur == '}' || cur == ']') {
                    queue.offer(cur);
                }
            }
            for (int i = 0; i < stack.size(); i++) {
                char openBrace = stack.pop();
                char closedBrace = queue.poll();
                if (openBrace == '(' && closedBrace == ')') {
                    areBalanced = true;
                } else if (openBrace == '{' && closedBrace == '}') {
                    areBalanced = true;
                } else if (openBrace == '[' && closedBrace == ']') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
