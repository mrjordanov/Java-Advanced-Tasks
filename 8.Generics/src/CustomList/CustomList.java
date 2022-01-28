package CustomList;

import java.util.*;
import java.util.stream.Stream;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void remove(int index) {
        this.elements.remove(index);
    }

    public boolean contains(T element) {
        if (this.elements.contains(element)) {
            return true;
        }
        return false;
    }

    public void swap(int firstIndex, int secondIndex) {
        T firstElement = this.elements.get(firstIndex);
        T secondElement = this.elements.get(secondIndex);
        this.elements.set(firstIndex, secondElement);
        this.elements.set(secondIndex, firstElement);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return Collections.max(this.elements);
    }

    public T getMin() {
        return Collections.min(this.elements);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.size();
            }

            @Override
            public T next() {
                return elements.get(index++);
            }
        };
    }

    public List<T> getElements() {
        return elements;
    }

/* public void print(){
        for (T element : elements) {
            System.out.println(element);
        }
    }*/
}
