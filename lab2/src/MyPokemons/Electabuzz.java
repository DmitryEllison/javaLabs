package MyPokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Electabuzz extends Elekid {
    public Electabuzz(String name, int level){
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(65D, 83D, 57D, 95D, 85D, 105D);
        setMove(new VitalThrow());
    }
}
