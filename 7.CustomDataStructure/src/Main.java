

public class Main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        for (int i = 0; i < 8; i++) {
            smartArray.add(i + 1);
        }

        int remove1 = smartArray.remove(0);
        System.out.println(remove1);
        smartArray.forEach(System.out::println);
    }
}
