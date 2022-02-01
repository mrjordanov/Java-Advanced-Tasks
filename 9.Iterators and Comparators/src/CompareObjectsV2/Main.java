package CompareObjectsV2;

import ComparingObjects.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();
        while (!input.equals("END")) {

            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            String town = input.split("\\s+")[2];
            Person person = new Person(name, age, town);
            people.add(person);
            input = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());
        Person personSearched = people.get(n - 1);


        int count = 0;
        for (Person p : people) {
            if (personSearched.compareTo(p) == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.print("No matches");
        } else {
            System.out.print(count + " ");
            System.out.print(people.size() - count + " ");
            System.out.print(people.size());
        }

    }
}

