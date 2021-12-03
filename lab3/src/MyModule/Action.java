package MyModule;

import Enums.*;
import java.util.List;

public abstract class Action {
    protected String nameOfAction;
    protected String message;
    protected int turns = 1;
    protected String turnDescription = String.valueOf(turns) + " раз";
    protected List<DescriptionAction> desA;

    public Action(String name){
        this.nameOfAction = name;
    }

    public Action(String name, int turns){
        this.nameOfAction = name;
        this.turns = turns;
    }

    public Action setTurns(int a){
        if (a > 1)
            this.turns = a;
        return this;
    }

    public void setName(String act){
        this.nameOfAction = act;
    }

    // Добавляем наречие/прилагательное описывающее глагол
    public Action addDescription(DescriptionAction ... descriptions){
        for (DescriptionAction i: descriptions)
            this.desA.add(i);
        return this;
    }

    // Задаем описание действия (например, шагнул 20 метров или повторил 20 раз)
    private Action turnDescription(String str){
        this.turnDescription = String.valueOf(this.turns) + " " + str;
        return this;
    }

    // Выводим что делает ПЕРСОНАЖ + (КАК?) + ГЛАГОЛ
    public String toString(MyObject o) {
        this.message = o.getName().substring(0, 1).toUpperCase() + o.getName().substring(1);
        for (DescriptionAction i : this.desA)
            this.message = this.message + " " + i;
        this.message = this.message + this.nameOfAction;
        // Если количество раз больше одного (или есть расстояние)
        if (this.turns > 1)
            this.message = this.message + " " + this.turnDescription;
        return this.message;
    }

}
