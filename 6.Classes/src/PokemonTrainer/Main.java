package PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        Map<String,List <Pokemon>> trainers = new LinkedHashMap<>();
        while (!input.equals("Tournament")) {
            String[] arg = input.split("\\s+");

            String trainerName = arg[0];
            String pokemonName = arg[1];
            String pokemonElement = arg[2];
            int pokemonHealth = Integer.parseInt(arg[3]);
            Pokemon pokemon= new Pokemon(pokemonName,pokemonElement,pokemonHealth);

            trainers.put(trainerName, new ArrayList<>());
            ArrayList<Pokemon> poks=new ArrayList<>();
            poks.add(pokemon);
            trainers.put(trainerName,poks);


            input = scanner.nextLine();
        }

        String element = scanner.nextLine();
        while (!element.equals("End")) {


            element = scanner.nextLine();
        }


    }
}
