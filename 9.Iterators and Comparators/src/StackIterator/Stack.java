package StackIterator;


import java.util.Iterator;

public class Stack<Integer> implements Iterable<Integer> {
    private Node<Integer> top;

    public Stack() {
        this.top = null;
    }

    public void push(int newElement) {
        Node<Integer> newNode = new Node<>(newElement);
        newNode.prev = this.top;
        this.top = newNode;
    }

    public int pop() throws Exception {
        if (this.top == null) {
            throw new Exception("No elements");
        } else {
            Node<Integer> currTop = this.top;
            this.top = this.top.prev;
            return currTop.element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            private Node<Integer> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                int currValue = current.element;
                this.current = this.current.prev;
                return (Integer) java.lang.Integer.valueOf(currValue);
            }
        };
    }

}
