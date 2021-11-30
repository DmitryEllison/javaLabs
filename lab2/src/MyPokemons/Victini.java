package MyPokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Victini extends Pokemon {
    public Victini(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC, Type.FIRE);
        setStats(100D, 100D, 100D, 100D, 100D, 100D);
        setMove(new SandAttack(), new AerialAttack(), new Astonish(), new NastyPlot());
    }
}
