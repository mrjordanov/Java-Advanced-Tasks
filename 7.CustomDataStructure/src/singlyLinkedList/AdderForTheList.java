package singlyLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class AdderForTheList {

    public static void insertElementsInList(Scanner scanner, SinglyLinkedList list) {

        System.out.print("Please enter a values (separated by a white space) for the numbers in the data base: ");

        while (true) {

            try {
                String input = scanner.nextLine();
                isInputNullOrEmpty(input);

                Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).forEach(list::addElement);
                break;

            } catch (NumberFormatException exception) {
                System.out.print("The entered numbers must be Integer values!\nPlease enter new values: ");
            } catch (NullPointerException exception) {
                System.out.print(exception.getMessage());
            }

        }

    }

    private static void isInputNullOrEmpty(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new NullPointerException("The data for list can't be null or white space!\nPlease enter new values: ");
        }

    }

}
