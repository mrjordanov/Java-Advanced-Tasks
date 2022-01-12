

import java.awt.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class AvvStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, LinkedList<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] arg = line.split(" ");
            String name = arg[0];
            double grade = Double.parseDouble(arg[1]);

            students.putIfAbsent(name, new LinkedList<>());
            LinkedList<Double> grades = students.get(name);
            grades.add(grade);

        }

        for (var entry : students.entrySet()) {
            LinkedList<Double> grades = entry.getValue();
            double avv = (grades.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
            System.out.print(entry.getKey() + " -> ");
            grades.forEach(e -> {
                System.out.printf("%.2f ", e);
            });
            System.out.printf("(avg: %.2f)", avv).println();
        }

    }
}
