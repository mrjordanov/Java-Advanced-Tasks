package CustomList;

public class Sorter {

    public static void sort(CustomList list) {
        int size = list.getElements().size();
        for (int index = 0; index < size; index++) {
            String element = (String) list.getElements().get(index);
            for (int nextIndex = index + 1; nextIndex < size; nextIndex++) {
                String nextElement = (String) list.getElements().get(nextIndex);
                if (element.compareTo(nextElement) > 0) {
                    list.swap(index, nextIndex);
                }
            }
        }
    }
}
