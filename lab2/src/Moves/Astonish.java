package Moves;

import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove {
    public Astonish(){
        super(Type.GHOST, 30, 1);
    }
    @Override
    protected java.lang.String describe(){
        return "Astonish deals damage and has a 30% chance of causing the target to flinch";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect = new Effect().chance(0.3);
        Effect.flinch(p);
        p.addEffect(effect);
    }
}
