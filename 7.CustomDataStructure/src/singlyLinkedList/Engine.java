package singlyLinkedList;


import java.util.Scanner;

import static singlyLinkedList.FinderForEnteredElement.findTheValueOfEnteredElement;
import static singlyLinkedList.AdderForTheList.insertElementsInList;

public class Engine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        insertElementsInList(scanner, singlyLinkedList);

        findTheValueOfEnteredElement(scanner, singlyLinkedList);

    }
}
