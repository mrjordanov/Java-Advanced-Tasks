package ListIterator;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).skip(1).collect(Collectors.toList());
        ListIterator listIterator = new ListIterator(data);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (command.equals("Move")) {
                System.out.println(listIterator.move());
            }
            if (command.equals("HasNext")) {
                System.out.println(listIterator.hasNext());
            }
            if (command.equals("Print")) {
                listIterator.print();
            }
            command = scanner.nextLine();
        }

    }
}
