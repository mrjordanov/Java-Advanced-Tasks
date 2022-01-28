package GenericCountMethod;

import java.util.List;

public class Box {

    public static <T extends Comparable<T>> int countOfGreaterElements(List<T> elements, T numberToCompare) {
        int count = 0;
        for (T element : elements) {
            int result = element.compareTo(numberToCompare);
            if (result > 0) {
                count++;
            }
        }
        return count;
    }

}
