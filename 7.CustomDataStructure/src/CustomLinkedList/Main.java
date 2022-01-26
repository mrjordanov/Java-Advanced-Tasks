package CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(5);
        list.addLast(10);
        list.addLast(15);

        System.out.print(list.getElement(2));


    }
}
