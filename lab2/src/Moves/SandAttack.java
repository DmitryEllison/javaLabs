package Moves;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove{
    public SandAttack(){
        super(Type.GROUND, 0, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "Sand Attack lowers the target's Accuracy by one stage.";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        System.out.println("Какой подлый трюк - ослепить врага песком!\nВсе-таки в этой битве все средства хороши.");
        Effect effect=new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(effect);
    }


}
