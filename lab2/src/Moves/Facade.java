package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 1);
    }
    @Override
    protected java.lang.String describe(){
        return "Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.";
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        if (att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE){
            System.out.println("Удар с двойной силой! Вот это мощь!");
            return (0.4D * (double)att.getLevel() + 2.0D) * this.power * 2 / 150.0D;

        }
        return (0.4D * (double)att.getLevel() + 2.0D) * this.power / 150.0D;
    }
}
