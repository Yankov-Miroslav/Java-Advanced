package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int NumberOfBadges;
    private List<Pokemon> pokemon;

    public Trainer(String name) {
        this.name = name;
        NumberOfBadges = 0;
        this.pokemon = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return NumberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        NumberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }
}
