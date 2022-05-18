package PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        while (!input.equals("Tournament")) {
            String[] information = input.split("\\s+");
            String trainerName = information[0];
            String pokemonName = information[1];
            String pokemonElement = information[2];
            int pokemonHealth = Integer.parseInt(information[3]);
            if (!trainerMap.containsKey(trainerName)) {
                Trainer trainer = new Trainer(trainerName);
                trainerMap.put(trainerName, trainer);
            }
            trainerMap.get(trainerName).setPokemon(new Pokemon(pokemonName, pokemonElement, pokemonHealth));
            input = in.nextLine();
        }
        input = in.nextLine();
        while (!input.equals("End")) {
            for (String s : trainerMap.keySet()) {
                boolean isEqual = false;
                for (int i = 0; i < trainerMap.get(s).getPokemon().size(); i++) {
                    if (trainerMap.get(s).getPokemon().get(i).getElement().equals(input)) {
                        trainerMap.get(s).setNumberOfBadges(trainerMap.get(s).getNumberOfBadges() + 1);
                        isEqual = true;
                    }
                }
                if (!isEqual) {
                    for (int i = 0; i < trainerMap.get(s).getPokemon().size(); i++) {
                        trainerMap.get(s).getPokemon().get(i).setHealth(trainerMap.get(s).getPokemon().get(i).getHealth() - 10);
                        if (trainerMap.get(s).getPokemon().get(i).getHealth() <= 0) {
                            trainerMap.get(s).getPokemon().remove(i);
                            i--;
                        }
                    }
                }
            }
            input = in.nextLine();
        }

        trainerMap
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().getNumberOfBadges()
                        , a.getValue().getNumberOfBadges()))
                .forEach(entry -> System.out.printf("%s %d %d%n", entry.getKey(),
                        entry.getValue().getNumberOfBadges(),
                        entry.getValue().getPokemon().size()));
    }
}