import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int numbersToPush = Integer.parseInt(arr[0]);
        int numbersToPop = Integer.parseInt(arr[1]);
        int numberToCheck = Integer.parseInt(arr[2]);

        //!!!! Прочитане на числата: чете число присвоява на първата променлива, чете второто на втората и т.н.
        // int numbersToPush = scanner.nextInt();
        // int numbersToPop = scanner.nextInt();
       //  int numberToCheck =scanner.nextInt();


        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int counterForAddElements = 0;
        for (String number : numbers) {
            counterForAddElements++;
            stack.push(Integer.parseInt(number));
            if (counterForAddElements == numbersToPush) {
                break;
            }
        }
        int counterForPoPElements = 0;
        while (counterForPoPElements < numbersToPop) {
            counterForPoPElements++;
            stack.pop();
        }

        if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            int minValue = Integer.MAX_VALUE;
            for (int number : stack) {
                if (number < minValue) {
                    minValue = number;
                }
            }
            System.out.println(minValue);
        }
    }
}
