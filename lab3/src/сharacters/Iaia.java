package сharacters;

import Enums.*;
import actions.*;

import MyModule.Character;

public class Iaia extends Character {
    public Iaia(String name){
        super(name);
        setSpecies(Species.DONKEY);
        addDesObject(DescriptionObject.OLD, DescriptionObject.GRAY);

        // перенести инициализацию в сам класс Actions
        addActoin(new go("пошел"), new across("перешел"), new see("смотреть"));
    }

}
