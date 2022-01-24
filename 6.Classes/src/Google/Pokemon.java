package Google;


import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private String type;
    private List<Person> pokemon;


    public Pokemon(String name,String type) {
        this.name = name;
        this.type=type;
        this.pokemon=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Person> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Person> pokemon) {
        this.pokemon = pokemon;
    }
}
