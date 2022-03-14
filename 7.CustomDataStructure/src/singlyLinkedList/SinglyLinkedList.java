package singlyLinkedList;

public class SinglyLinkedList {

    private static class Node {
        int element;
        private Node next;

        private Node(int element) {
            this.element = element;
            this.next = null;
        }

        private int getElement() {
            return element;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public void addElement(int number) {

        Node newNode = new Node(number);

        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getTheValueOfTheUserEnteredElement(int elementNumber, SinglyLinkedList list) {

        ValidationForEnteredElement.validatedElement(elementNumber, list);

        Node current = this.head;

        int desiredElementValue = 0;
        int curElement = 1;

        if (elementNumber == this.size) {
            return this.tail.getElement();
        } else {
            elementNumber = this.size - elementNumber;
        }

        while (current != null) {
            if (curElement == elementNumber) {
                desiredElementValue = current.getElement();
                break;
            }
            curElement++;
            current = current.next;
        }

        return desiredElementValue;
    }

    protected int getSize() {
        return size;
    }

}
