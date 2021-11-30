package Moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest() {
        super(Type.PSYCHIC,0.0,1);
    }
    @Override
    protected java.lang.String describe(){
        return "User sleeps for 2 turns, but user is fully healed.";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        System.out.println("Хм, кажется он решил поспать, чтобы восстановить себе здоровье!");
        Effect effect=new Effect();
        effect.turns(2);
        Effect.sleep(p);
        effect.stat(Stat.HP);
        p.addEffect(effect);
    }
}
