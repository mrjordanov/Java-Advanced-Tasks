package Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Person> mapForPerson = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] arg = input.split("\\s+");

            String name = arg[0];
            if (arg[1].equals("company")) {
                String companyName = arg[2];
                String department = arg[3];
                double salary = Double.parseDouble(arg[4]);

                Person person = new Person(name, companyName, department, salary);
                mapForPerson.put(name, person);

                if (name.equals(person.getName())) {
                    person.setCompany(companyName);
                    person.setDepartment(department);
                    person.setSalary(salary);
                    mapForPerson.put(name, person);

                }
            }
            if (arg[1].equals("pokemon")) {
                String pokemonName = arg[2];
                String pokemonType = arg[3];
                Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                Person person = new Person(name, pokemon);
                mapForPerson.put(name, person);
            }
            if (arg[1].equals("parents")) {
                String parentName = arg[2];
                String parentBirthDay = arg[3];

                Parents parents = new Parents(parentName, parentBirthDay);
                Person person = new Person(name, parents);
                mapForPerson.put(name, person);
            }
            if (arg[1].equals("children")) {
                String childName = arg[2];
                String childBirthDay = arg[3];

                Children children = new Children(childName, childBirthDay);
                Person person = new Person(name, children);
                mapForPerson.put(name, person);

            }
            if (arg[1].equals("car")) {
                String car = arg[2];
                int speed = Integer.parseInt(arg[3]);

                Person person = new Person(name, car, speed);
                mapForPerson.put(name, person);

                if (name.equals(person.getName())) {
                    person.setCar(car);
                    person.setSpeed(speed);
                    mapForPerson.put(name, person);
                }

            }

            input = scanner.nextLine();
        }


        String last = scanner.nextLine();

        System.out.println(last);
        for (Person value : mapForPerson.values()) {
            if (value.getName().equals(last)) {
                String output = String.format("%.2f", value.getSalary());
                System.out.println("Company:");
                System.out.println(value.getCompany() + " " + value.getDepartment() + " " + output);
                System.out.println("Car:");
                System.out.println(value.getCar() + " " + value.getSpeed());
                System.out.println("Pokemon:");
                value.getPokemon().getPokemon().stream().forEach(System.out::println);
            }
        }



       /* for (Map.Entry<String, Person> entry : mapForPerson.entrySet()) {
            String output=  String.format("%.2f",entry.getKey());
            if (entry.getKey().equals(last)){
                System.out.print("Company:\n"+entry.getValue().getCompany()+" "+entry.getValue().getDepartment()+" "+output);
            }
        }*/

    }
}
