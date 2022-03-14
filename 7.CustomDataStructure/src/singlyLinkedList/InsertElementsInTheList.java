package singlyLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementsInTheList {

    public static void insertElementsInList(Scanner scanner, SinglyLinkedList list) {

        System.out.print("Please enter a values for the numbers in the data base: ");

        while (true) {

            try {
                int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                for (int number : numbers) {
                    list.addElement(number);
                }
                break;

            } catch (NumberFormatException exception) {
                System.out.print("The entered numbers must be Integer values!\nPlease enter new values: ");
            }

        }

    }
}
