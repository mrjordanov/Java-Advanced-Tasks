package GenericSwapMethod;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void swapElements(int firstIndex, int secondIndex) {
        T elementOne = this.elements.get(firstIndex);
        T elementTwo = this.elements.get(secondIndex);
        this.elements.set(secondIndex, elementOne);
        this.elements.set(firstIndex, elementTwo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(String.format("%s: %s", element.getClass().getName(), element));
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
