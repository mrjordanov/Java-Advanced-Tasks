import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }
                else {
                   String remove= queue.poll();
                    System.out.printf("Canceled %s",remove).println();
                }
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        //вариант с foreach
        for (String s:queue) {
            System.out.println(s);
        }

        //вариант със стреам:
        // System.out.println(queue.stream().map(String::valueOf)
        //    .collect(Collectors.joining(System.lineSeparator())));


        //вариант с while
       // while (!queue.isEmpty()){
        //    System.out.println(queue.poll());
       // }
    }
}
