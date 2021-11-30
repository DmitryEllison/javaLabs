package Moves;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {
    public NastyPlot(){
        super(Type.DARK, 0, 1);
    }
    @Override
    protected java.lang.String describe(){
        return "Astonish deals damage and has a 30% chance of causing the target to flinch";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, 2);
    }
}
