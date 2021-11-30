package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AerialAttack extends PhysicalMove {
    public AerialAttack(){
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }
    @Override
    protected java.lang.String describe(){
        return "Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.";
    }
}
