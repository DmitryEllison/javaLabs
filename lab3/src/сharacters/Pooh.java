package сharacters;

import Enums.*;
import MyModule.Character;

public class Pooh extends Character {
    public Pooh(String name){
        super(name);
        setSpecies(Species.BEAR);
    }
}
