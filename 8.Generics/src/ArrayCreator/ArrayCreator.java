package ArrayCreator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCreator {

    public static <T> T[] create(int length, T def) {
        T[] arr = (T[]) Array.newInstance(def.getClass(), length);

        Arrays.fill(arr, def);
        return arr;
    }

    public static <T> T[] create(Class<T> clazz, int length, T def) {
        T[] arr = (T[]) Array.newInstance(clazz, length);

        Arrays.fill(arr, def);
        return arr;
    }

   /* public static <P> List<P> newList( P add){
        List<P> list= new ArrayList<P>();
        list.add(add);
        list.add(add);

        return list;
    }*/

}
