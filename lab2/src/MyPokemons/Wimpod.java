package MyPokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level){
        super(name, level);
        setType(Type.BUG, Type.WATER);
        setStats(25D, 35D, 40D, 20D, 30D, 80D);
        setMove(new Confide(), new ShadowBall(), new Rest());
    }
}
