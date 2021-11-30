package Moves;
import ru.ifmo.se.pokemon.*;

public class Confide extends SpecialMove{
    public Confide(){
        super(Type.NORMAL, 0 , 1 );
    }
    @Override
    protected java.lang.String describe(){
        return "Confide lowers the target's Special Attack by one stage.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(effect);
    }

}
