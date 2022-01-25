import java.util.function.Consumer;

public class SmartArray {
    private final static int INITIAL_CAPACITY = 8;

    private int[] elements;
    private int size;


    public SmartArray() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(int element) {
        if (this.size == elements.length) {
            this.elements = grow();
        }

        this.elements[this.size] = element;
        this.size++;
    }


    private int[] grow() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);

        return newElements;
    }

    public int get(int index) {
        ensureIndex(index);

        return this.elements[index];
    }

    public int remove(int index) {
        ensureIndex(index);

        int removed = this.elements[index];

        if (this.size - 1 - index >= 0)
            System.arraycopy(this.elements, index + 1, this.elements, index, this.size - 1 - index);

        this.elements[this.size - 1] = 0;
        this.size--;

        if (this.size <= this.elements.length / 4 || this.size <= INITIAL_CAPACITY) {
            this.elements = shrink();
        }

        return removed;
    }

    private int[] shrink() {
        int[] newElements = new int[this.elements.length / 2];

        for (int i = 0; i < this.size; i++) {
            newElements[i] = this.elements[i];
        }

        return newElements;
    }

    private void ensureIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + this.size);
        }
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (element == elements[i]) {
                return true;
            }
        }

        return false;
    }

    public void add(int index, int element) {
        ensureIndex(index);

        int lastElement = this.elements[this.size - 1];

        for (int i = this.size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        this.elements[index] = element;
        add(lastElement);
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.elements[i]);
        }
    }


}
