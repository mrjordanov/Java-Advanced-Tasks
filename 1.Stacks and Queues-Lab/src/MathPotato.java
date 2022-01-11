import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child:input) {
            queue.offer(child);
        }
        int n = Integer.parseInt(scanner.nextLine());
        int cycle=1;
        while (queue.size()>1){
            for (int i = 1; i <n ; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)){
                System.out.println("Prime "+queue.peek());
            }
            else {
                System.out.println("Removed "+queue.poll());
            }
            cycle++;
            }
        System.out.println("Last is "+queue.poll());
    }

    private static boolean isPrime(int cycle) {
        boolean isPrimeCycle=true;
            for (int j =2; j <=cycle-1; j++) {
                if (cycle%j==0){
                    isPrimeCycle=false;
                    break;
                }
            }
        return isPrimeCycle;
    }

}
