package singlyLinkedList;


import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        System.out.println("Please enter a values for the numbers in the data base:");

        while (true) {


            try {
                int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                for (int number : numbers) {
                    singlyLinkedList.addElement(number);
                }
                break;

            } catch (NumberFormatException exception) {
                System.out.print("The entered numbers must be Integer values!\nPlease enter new values: ");
            }

        }

        System.out.print("Please enter a number for desired element: ");

        while (true) {

            try {
                int desiredElement = Integer.parseInt(scanner.nextLine());
                int value = singlyLinkedList.getTheValueOfTheUserEnteredElement(desiredElement, singlyLinkedList);
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
