package GenericCountMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            doubleList.add(Double.parseDouble(scanner.nextLine()));
        }

        double numberToCompare = Double.parseDouble(scanner.nextLine());
        int count = Box.countOfGreaterElements(doubleList, numberToCompare);
        System.out.print(count);
    }
}
