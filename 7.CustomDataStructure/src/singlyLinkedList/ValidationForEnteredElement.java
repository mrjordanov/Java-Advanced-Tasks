package singlyLinkedList;

public class ValidationForEnteredElement {

    public static void validatedElement(int element, SinglyLinkedList list) {

        String message = "Please enter a new number ";
        if (element < 0) {
            throw new IllegalArgumentException("Please enter a positive Integer number for the desired element!\n" + message + ": ");
        }
        if (list.getSize() == 0) {
            throw new IllegalStateException("The entered number (" + element + ") of element doesn't exist," +
                    " because the data base is empty!\n" + message + ":");
        }
        if (element >= list.getSize()) {
            String messageOutput = "The number of elements in the data base are " + list.getSize() + ".";
            throw new IllegalArgumentException(messageOutput + "\n" + message + " between [0," + (list.getSize() - 1) + "] : ");
        }

    }

}
