package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();
        while (!input.equals("END")) {
            Person person = null;
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            String town = input.split("\\s+")[2];
            person = new Person(name, age, town);
            personList.add(person);
            input = scanner.nextLine();
        }

        int number = Integer.parseInt(scanner.nextLine());

       int count=-1;
        for (Person person : personList) {
         if(personList.get(number-1).compareTo(person)>0){
             count++;
         }
        }
        if (count==0){
            System.out.print("No matches");
        } else {
            count=count+1;
            System.out.print(count+" ");
            System.out.print(personList.size()-count+" ");
            System.out.print(personList.size());
        }
    }
}
