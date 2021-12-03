package MyModule;

import things.*;
import сharacters.*;

public class Play {
    private Pooh pooh;
    private Pyatachok pyatachok;
    private Slonopotam slonopotam;
    private Iaia iaia;

    private Hole hole;
    private Trap trap;
    private Sky sky;
    private Rain rain;

    public void addPooh(Pooh pooh){ this.pooh = pooh; }

    public void addIaia(Iaia iaia){
        this.iaia = iaia;
    }

    public void addPyatachok(Pyatachok pyatachok){
        this.pyatachok = pyatachok;
    }

    public void addSlonopotam(Slonopotam slonopotam){ this.slonopotam = slonopotam; }

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

    private void Introduction(){
        System.out.println("Однажды в одной сказочной стране...");
    }

    public void go(){
        this.Introduction();
        this.iaia.descriptionObject();

    }
}
