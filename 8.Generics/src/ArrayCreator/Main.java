package ArrayCreator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = ArrayCreator.<Integer>create(10, 13);
        String[] strings=ArrayCreator.<String>create(String.class,3,"Java");

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        for (String string : strings) {
            System.out.println(string);
        }

      /*  List<Integer> list=ArrayCreator.newList(10);

        for (Integer integer : list) {
            System.out.println(integer);
        }*/

    }
}
