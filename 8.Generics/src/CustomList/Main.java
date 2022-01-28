package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CustomList<String> list = new CustomList<String>();

        while (!input.equals("END")) {
            String operation = input.split("\\s+")[0];
            if (operation.equals("Add")) {
                String toAdd = input.split("\\s+")[1];
                list.add(toAdd);
            }
            if (operation.equals("Remove")) {
                int indexToRemove = Integer.parseInt(input.split("\\s+")[1]);
                list.remove(indexToRemove);
            }
            if (operation.equals("Contains")) {
                String findElement = input.split("\\s+")[1];
                System.out.println(list.contains(findElement));
            }
            if (operation.equals("Swap")) {
                int firstIndex = Integer.parseInt(input.split("\\s+")[1]);
                int secondIndex = Integer.parseInt(input.split("\\s+")[2]);
                list.swap(firstIndex, secondIndex);
            }
            if (operation.equals("Greater")) {
                String check = input.split("\\s+")[1];
                int result = list.countGreaterThan(check);
                System.out.println(result);
            }
            if (operation.equals("Max")) {
                System.out.println(list.getMax());
            }
            if (operation.equals("Min")) {
                System.out.println(list.getMin());
            }
            if (operation.equals("Print")) {
                for (String element : list) {
                    System.out.println(element);
                }
                /*list.print();*/
            }
            if (operation.equals("Sort")) {
                Sorter.sort(list);
            }

            input = scanner.nextLine();
        }


    }
}
