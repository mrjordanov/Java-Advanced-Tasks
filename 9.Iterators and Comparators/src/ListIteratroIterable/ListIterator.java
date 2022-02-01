package ListIteratroIterable;

import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<String> {
    private List<String> data;//списък за обхождане
    private int index;//текущ индекс

    public ListIterator(List<String> data) {
        this.data = data;
        if (this.data.size() != 0) {
            this.index = 0;
        } else {
            this.index = -1;
        }
    }

    public boolean move() {
        if (this.index < this.data.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (this.index < this.data.size() - 1) {
            return true;
        }
        return false;
    }

    public void print() {
        if (!this.data.isEmpty()) {
            System.out.println(this.data.get(this.index));
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    public void printAll() {
        for (String s : this.data) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size() - 1;
            }

            @Override
            public String next() {
                return data.get(index++);
            }
        };
    }

}
