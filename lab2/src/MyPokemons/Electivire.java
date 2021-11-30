package MyPokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Electivire extends Electabuzz {
    public Electivire(String name, int level){
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(75D, 123D, 67D, 95D, 85D, 95D);
        setMove(new Confide(), new Facade(), new VitalThrow());
    }
}
