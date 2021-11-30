package Moves;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{
    public ShadowBall(){
        super(Type.GHOST, 80, 1);
    }
    @Override
    public java.lang.String describe(){
        return "Shadow Ball deals damage and has a 20% chance of lowering the target's Special Defense by one stage.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(effect);
    }
}
