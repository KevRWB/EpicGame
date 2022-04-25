package Battle;
import java.util.ArrayList;

public class Monster {

    String name;
    int att;
    int def;
    int health;

    //CONSTRUCTOR
    public Monster(String name, int att, int def, int health){
        this.name = name;
        this.att = att;
        this.def = def;
        this.health = health;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        Monster zombie = new Monster("Zombie", 30, 60,60);
        Monster bat = new Monster("Bat", 10,10,20);
        Monster wolf = new Monster("Wolf", 60, 40, 40);
    }
}
