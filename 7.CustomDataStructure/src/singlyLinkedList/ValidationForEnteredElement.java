package singlyLinkedList;

public class ValidationForEnteredElement {

    public static void validatedElement(int element, SinglyLinkedList list) {
        if (element < 0) {
            throw new IllegalArgumentException("Please enter a positive Integer number for the desired element!");
        }
        if (list.getSize() == 0) {
            throw new IllegalStateException("There is no such element with value " + element + ", because the data base is empty!");
        }
        if (element > list.getSize()) {
            String messageOutput = "The number of elements in the data base are " + list.getSize() + ".";
            throw new IllegalArgumentException(messageOutput + " Please enter a number in this range [0," + list.getSize() + "].");
        }

    }
}
