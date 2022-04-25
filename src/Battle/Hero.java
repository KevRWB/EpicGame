package Battle;

import java.util.ArrayList;

public class Hero {
    int id;
    String name;
    int att;
    int def;
    int health;


     static ArrayList<Hero> heroList = new ArrayList<>();

    //CONSTRUCTOR //////////////////////////
    public Hero(int id, String name, int att, int def, int health){
        this.id = id;
        this.name = name;
        this.att = att;
        this.def = def;
        this.health = health;

        heroList.add(this);
    }

    //MAIN METHOD ////////////////////////////////////////////////
    public static void main(String[] args) {

        Hero roger = new Hero(1, "Roger", 60, 30, 100);
        Hero martina = new Hero(2, "Martina", 80,30, 100);
        Hero zod = new Hero(3, "Zod", 70,50, 100);

    }

    //METHODS ///////////////////////////////////////////////



}
