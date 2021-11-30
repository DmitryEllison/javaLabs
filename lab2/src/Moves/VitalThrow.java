package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class VitalThrow extends PhysicalMove {
    public VitalThrow(){
        super(Type.FIGHTING, 70, Double.POSITIVE_INFINITY);
    }
    @Override
    protected java.lang.String describe(){
        return "Vital Throw deals damage with lower priority, so most attacks will take place before it.";
    }

}
