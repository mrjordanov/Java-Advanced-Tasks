package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            BoxOption<String> secondBox = new BoxOption<>(scanner.nextLine());
            System.out.println(secondBox);
            //  box.addElement(scanner.nextLine());
        }

        // System.out.print(box);
    }
}
