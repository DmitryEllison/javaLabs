package MyPokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Golisopod extends Wimpod {
    public Golisopod(String name, int level){
        super(name, level);
        setType(Type.BUG, Type.WATER);
        setStats(75D, 125D, 140D, 60D, 90D, 40D);
        setMove(new Confide(), new ShadowBall(), new Rest(), new SandAttack());
    }
}
