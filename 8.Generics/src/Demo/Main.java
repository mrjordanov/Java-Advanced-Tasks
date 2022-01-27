package Demo;


public class Main {
    public static void main(String[] args) {
        System.out.print(getGreater(10,50));

    }

    public static <T extends Comparable<T>> T getGreater(T first, T second) {
        int result = first.compareTo(second);
        return result >= 0 ? first : second;
    }
}
