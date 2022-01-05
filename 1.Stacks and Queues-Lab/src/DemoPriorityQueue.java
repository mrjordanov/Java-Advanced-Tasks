import java.util.PriorityQueue;
import java.util.Scanner;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(13);
        numbers.offer(5);
        numbers.offer(69);
        numbers.offer(42);

        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
