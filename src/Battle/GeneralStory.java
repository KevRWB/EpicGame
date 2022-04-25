package Battle;
import java.util.ArrayList;

public class GeneralStory {


    //MAIN METHOD ////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        GeneralStory story =new GeneralStory();

        System.out.println("Bonjour, bienvenu dans ce programme de bataille épique.");
        System.out.println("Veuillez commencer par choisir votre héros : ");
        GeneralStory.showHeroes();//   PB CALLING THIS METHOD ????????????????


    }

    // METHODS ////////////////////////////////////////////////////////////////

    //Show Heroes
    public void showHeroes(){
        for (Hero hero : Hero.heroList) {
            System.out.println(hero.id + "/ " + hero.name + ": " + " Attaque : " + hero.att + ", Défense : " + hero.def + ", Vie : " + hero.health);
        }
    }

}
