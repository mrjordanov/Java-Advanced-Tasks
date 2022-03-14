package singlyLinkedList;

import java.util.Scanner;

public class FinderForEnteredElement {

    public static void findTheValueOfEnteredElement(Scanner scanner, SinglyLinkedList list) {

        System.out.print("Please enter a number for desired element: ");

        while (true) {

            try {
                int desiredElement = Integer.parseInt(scanner.nextLine());
                int value = list.getTheValueOfTheUserEnteredElement(desiredElement, list);
                System.out.print("The value of entered element is " + value + ".");
                break;

            } catch (NumberFormatException exception) {
                System.out.print("The entered value of desired element must be an Integer number.\n" +
                        "Please enter a new number: ");
            } catch (IllegalArgumentException | IllegalStateException exception) {
                System.out.print(exception.getMessage());
            }

        }

    }

}
