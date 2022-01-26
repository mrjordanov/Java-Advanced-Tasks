package CustomLinkedList;

import java.util.function.Consumer;

public class DoublyLinkedList {
    private class Node { //всеки елемент от списъка със следните характеристики:
        private int element; //елемент
        private Node next;  //следващ ел;
        private Node prev;  //предходен

        private Node(int element) {
            this.element = element;
        }
    }

    private Node head;   //глава
    private Node tail;  //опашка
    private int size;   //размер на листа;

    //методи
    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    public void addLast(int element) {
        Node newNode = new Node(element);
        if (this.size == 0) {
            this.tail = this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    public int removeFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Cannot remove element from collection with size 0.");
        } else if (this.size == 1) {
            Node firstElement = this.head;
            this.head = null;
            this.tail = null;
            this.size = 0;
            return firstElement.element;
        } else {

            Node firstElement = this.head;
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
            return firstElement.element;
        }
    }

    public int removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Cannot remove element from collection with size 0.");
        } else if (this.size == 1) {
            Node lastElement = this.tail;
            this.tail = null;
            this.head = null;
            this.size = 0;
            return lastElement.element;
        } else {
            Node lastElement = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            this.size--;
            return lastElement.element;
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        Node cur = this.head;
        while (cur != null) {
            consumer.accept(cur.element);
            cur = cur.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[this.size];

        int index = 0;
        Node cur = this.head;
        while (cur != null) {
            array[index] = cur.element;
            index++;
            cur = cur.next;
        }
        return array;
    }

    public int getElement(int index) {
        validatedIndex(index);

        int element = 0;
        int curIndex = 0;
        Node cur = this.head;
        while (cur != null) {
            if (curIndex == index) {
                element = cur.element;
                break;
            }
            curIndex++;
            cur = cur.next;
        }
        return element;
    }

    private void validatedIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Index " + index + " was out of structure bound!");
        }
    }


}
