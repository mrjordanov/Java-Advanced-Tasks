package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer() {
      this.pokemons=new ArrayList<>();
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges=badges;
    }

}
