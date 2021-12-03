package MyModule;

import Enums.DescriptionObject;
import Enums.Species;

import java.util.LinkedList;
import java.util.List;

public abstract class MyObject {
    protected String name;
    protected String message = "";
    protected List<DescriptionObject> desO;
    protected Species species;

    public MyObject(String name){
        this.name = name;
        this.desO = new LinkedList();
    }

    public MyObject(String name, DescriptionObject ... desO){
        this.name = name;
        for (DescriptionObject i: desO)
            this.desO.add(i);
    }

    public String getName() {
        return name;
    }

    public void descriptionObject(){
        for (DescriptionObject i: this.desO)
            this.message = i + " ";
        System.out.println(this.message + " " + this.name);
    }

}
