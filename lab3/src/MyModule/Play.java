package MyModule;

import things.*;
import сharacters.*;

public class Play {
    private Pooh pooh;
    private Pyatachok pyatachok;
    private Slonopotam slonopotam;
    private Hole hole;
    private Trap trap;
    private Sky sky;
    private Rain rain;

    public void addPooh(Pooh pooh){
        this.pooh = pooh;
    }

    public void addPyatachok(Pyatachok p){
        pyatachok = p;
    }

    public void addSlonopotam(Slonopotam s){
        slonopotam = s;
    }

    public void addHole(Hole hole){
        this.hole = hole;
    }

    public void addTrap(Trap trap){
        this.trap = trap;
    }

    public void addSky(Sky sky){
        this.sky = sky;
    }

    public void addRain(Rain rain){
        this.rain = rain;
    }

    public void go(){

    }
}
