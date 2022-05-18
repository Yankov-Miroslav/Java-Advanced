package Google;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pokemon {

    Map<String, String> pokemonsMap = new LinkedHashMap<>();

    public Pokemon(String pokemonName, String pokemonType) {
        pokemonsMap.put(pokemonName, pokemonType);

    }

    public Map<String, String> getPokemonsMap() {
        return pokemonsMap;
    }

    public void setPokemonsMap(String pokemonName, String pokemonType) {
        pokemonsMap.put(pokemonName, pokemonType);
    }

}