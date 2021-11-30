import MyPokemons.*;
import ru.ifmo.se.pokemon.*;

public class lab2 {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Wimpod("Вамся", 7);
        Pokemon p2 = new Elekid("Вламдик", 13);
        Pokemon p3 = new Electivire("Мдимка", 2);
        b.addAlly(p1);

        Pokemon s1 = new Electabuzz("Маринка", 9);
        Pokemon s2 = new Golisopod("Анечка", 10);
        Pokemon s3 = new Victini("Дошик", 5);
        b.addFoe(s1);
        b.addFoe(s2);
        b.addFoe(s3);
        b.addFoe(p2);
        b.addFoe(p3);
        b.go();
    }
}
