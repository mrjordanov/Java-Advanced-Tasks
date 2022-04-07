import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(15);
        stack.push(73);
        stack.push(69);
        System.out.println(stack.peek());

        Set<Integer> integerSet= new HashSet<>();
        integerSet.add(null);
        System.out.println(integerSet.isEmpty());


        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(13);
        queue.offer(73);
        queue.offer(69);
        System.out.println(queue.peek());

        System.out.println();

        List<Integer> list= new ArrayList<>();
        list.add(null);

    }
}
