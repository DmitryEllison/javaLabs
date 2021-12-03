package MyModule;

import Enums.*;

import java.util.LinkedList;
import java.util.List;

public class Character extends MyObject {
    protected List<DescriptionObject> desObjList;
    protected List<Action> ActList;
    protected Species species;

    public Character(String name){
        super(name);
        this.desObjList = new LinkedList();
        this.ActList = new LinkedList();
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void addActoin(Action ... des){
        ActList.clear();
        if (des != null){
            for (Action i: des)
                ActList.add(i);
        }

    }

    public void addDesObject(DescriptionObject ... des){
        desObjList.clear();
        if (des != null){
            for (DescriptionObject i: des)
                desObjList.add(i);
        }
    }

    @Override
    public void descriptionObject(){
        for (DescriptionObject i: this.desO)
            this.message = i + " ";
        System.out.println("Был создан " + this.message + " " + this.species + " " + this.name);
    }
}
