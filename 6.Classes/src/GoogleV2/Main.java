package GoogleV2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Person> personData = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] parameters = input.split("\\s+");
            String name = parameters[0];
            if (!personData.containsKey(name)){
                personData.put(name,new Person());
            }
            String enteredData = parameters[1];
            if (enteredData.equals("company")) {
                String companyName = parameters[2];
                String department = parameters[3];
                double salary = Double.parseDouble(parameters[4]);

                Company company = new Company(companyName, department, salary);
                personData.get(name).setCompany(company);

            }

            if (enteredData.equals("pokemon")) {
                String pokemonName = parameters[2];
                String pokemonType = parameters[3];

                Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                personData.get(name).getPokemons().add(pokemon);
            }

            if (enteredData.equals("parents")) {
                String parentName = parameters[2];
                String parentBirthday = parameters[3];

                Parent parent = new Parent(parentName, parentBirthday);
                personData.get(name).getParents().add(parent);
            }

            if (enteredData.equals("children")) {
                String childName = parameters[2];
                String childBirthday = parameters[3];

                Child child = new Child(childName, childBirthday);
                personData.get(name).getChildren().add(child);
            }

            if (enteredData.equals("car")) {
                String carName = parameters[2];
                int carSped = Integer.parseInt(parameters[3]);

                Car car = new Car(carName, carSped);
                personData.get(name).setCar(car);
            }

            input = scanner.nextLine();
        }

        String search = scanner.nextLine();

        System.out.println(search);

        Person personalData = personData.get(search);
        System.out.print(personalData);


    }
}
