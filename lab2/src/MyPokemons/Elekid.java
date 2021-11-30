package MyPokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Elekid extends Pokemon {
    public Elekid(String name, int level){
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(45D, 63D, 37D, 65D, 55D, 95D);
        setMove(new Confide(), new Facade());
    }
}
