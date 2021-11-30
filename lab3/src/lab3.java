import MyModule.Play;
import things.Hole;
import things.Rain;
import things.Sky;
import things.Trap;
import сharacters.Pooh;
import сharacters.Pyatachok;
import сharacters.Slonopotam;

public class lab3 {
    public static void main(String[] args){
        Play play = new Play();

        play.addPooh(new Pooh("Pooh"));
        play.addPyatachok(new Pyatachok("Pyatachok"));
        play.addSlonopotam(new Slonopotam("Slonopotam"));
        play.addHole(new Hole("hole"));
        play.addRain(new Rain("rain"));
        play.addSky(new Sky("sky"));
        play.addTrap(new Trap("trap"));

        play.go();
    }
}
