import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(15);
        stack.push(73);
        stack.push(69);
        stack.peek();


        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(13);
        queue.offer(73);
        queue.offer(69);

        queue.peek();

        System.out.println();
    }
}
