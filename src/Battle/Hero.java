package Battle;

import java.util.*;

public class Hero {
    int id;
    String name;
    int att;
    int def;
    int health;


    //CONSTRUCTOR //////////////////////////
    public Hero(int id, String name, int att, int def, int health){
        this.id = id;
        this.name = name;
        this.att = att;
        this.def = def;
        this.health = health;
    }

    //METHODS ///////////////////////////////////////////////

    // ici on redéfinie la méthode to string de l'objet
    @Override
    public String toString() {
        return this.id + "/ " + this.name + ": " + " Attaque : " + this.att + ", Defense : " + this.def + ", Vie : " + this.health;
    }

}