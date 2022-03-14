package singlyLinkedList;


import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        System.out.println("Please enter a values for the numbers in the data base:");

        while (true) {

            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            try {

                for (int number : numbers) {
                    singlyLinkedList.addElement(number);
                }
                break;

            } catch (NumberFormatException exception) {
                System.out.println("The entered numbers must be Integer values!\nPlease enter new values:");
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
                System.out.println("The entered value of desired element must be an Integer number.");
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }


    }
}
