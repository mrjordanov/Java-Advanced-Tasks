import java.util.*;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> firstBox_stack = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(secondNumbers);

        Deque<Integer> secondBox_queue = new ArrayDeque<>(secondNumbers);
        List<Integer> retainedElements = new ArrayList<>();

        while (!firstBox_stack.isEmpty()) {
            if (!secondBox_queue.isEmpty()) {
                int result = firstBox_stack.peek() + secondBox_queue.peek();
                if (result % 2 == 0) {
                    retainedElements.add(result);
                    firstBox_stack.pop();
                    secondBox_queue.poll();
                } else {
                    int removed = secondBox_queue.poll();
                    firstBox_stack.addLast(removed);
                }

                if (secondBox_queue.isEmpty()) {
                    System.out.println("Second magic box is empty.");
                    break;
                }
            }
        }

        if (firstBox_stack.isEmpty()) {
            System.out.println("First magic box is empty.");
        }
        int sum = retainedElements.stream().mapToInt(Integer::intValue).sum();
        if (sum > 90) {
            System.out.printf("Wow, your prey was epic! Value: %d", sum);
        } else {
            System.out.printf("Poor prey... Value: %d", sum).println();
        }
    }
}
