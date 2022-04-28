package Battle;

import java.util.*;

public class GeneralStory {

    // methode principale (en fait dans les codes j2ee Spring boot par exemple, on n'a qu'une méthode qui se lance et ensuite y a rien d'autre
    // à faire dans le main méthode)

    //MAIN METHOD ////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //Create Keyboard Scanner for inputs
        Scanner keyboard = new Scanner(System.in);

        //Create Instance Story
        GeneralStory story = new GeneralStory();

        //Initialize Heroes, Monsters & Potions
        List<Hero> heroes =  initHeroes();
        List<Monster> monsters = initMonsters();
        List<Potion> potions = initPotions();

        //Start STORY
        System.out.println("Bonjour, bienvenu dans ce programme de bataille épique.");
        System.out.println("Veuillez commencer par choisir votre héro : ");

        //show Heroes List to select
        story.showHeroes(heroes);
        System.out.println("Votre choix : ");
        int heroChoice = keyboard.nextInt();
        story.selectHero(heroChoice);
        System.out.println("Vous avez choisi "+ story.heroSelected);

        //SHOW FIRST MONSTER
        System.out.println("Votre premier adversaire est : ");
        story.showMonster(0);

        //SHOW AVAILABLE POTIONS
        story.showPotions(potions);
        story.potionChoice = keyboard.next();

    }

    // METHODS ////////////////////////////////////////////////////////////////

    //Initialization of Heroes
    protected static List<Hero> initHeroes() {
        List<Hero> heroes = new ArrayList<>();
        Hero roger = new Hero(1, "Roger", 60, 30, 100);
        heroes.add(roger);
        Hero martina = new Hero(2, "Martina", 80,30, 100);
        heroes.add(martina);
        Hero zod = new Hero(3, "Zod", 70,50, 100);
        heroes.add(zod);

        return heroes;
    }

    //Initialization of Monsters
    protected static List<Monster> initMonsters(){
        List<Monster> monsters = new ArrayList<>();
        Monster zombie = new Monster(1,"Zombie", 30, 60,60);
        monsters.add(zombie);
        Monster bat = new Monster(2,"Bat", 10,10,20);
        monsters.add(bat);
        Monster wolf = new Monster(3,"Wolf", 60, 40, 40);
        monsters.add(wolf);

        return monsters;
    }

    // Initialization of Potions
    boolean haveInitiative = false;
    protected static List<Potion> initPotions(){
        List<Potion> potions = new ArrayList<>();
        HealthPotion healthPotion = new HealthPotion("Health Potion", true, 30);
        potions.add(healthPotion);
        AttackPotion attackPotion = new AttackPotion("Attack potion", true, 20, 3);
        potions.add(attackPotion);
        InitiativePotion initiativePotion = new InitiativePotion("Initiative potion", true, 3);
        potions.add(initiativePotion);

        return potions;
    }

    //SHOW POTIONS AVAILABLE
    protected void showPotions(final List<Potion> potions){
        System.out.println("Potions disponibles :");
        //Create and fill List of potions available
        List<Potion> potionsList = new ArrayList<>();
        for(Potion potion : potions){
            if(potion.hasPotion == true){
                potionsList.add(potion);
            }
        }
        //Print available potion
        for(Potion potion : potionsList){
            System.out.println((potionsList.indexOf(potion) + 1) + "/ " + potion.name);
            System.out.println("Voulez vous prendre une potion ? O/N");
        }
    }

    //Take Potion CHOICE
    String potionChoice;
    protected void takePotion(){
        String potionChoiceLower = potionChoice.toLowerCase();
        if(potionChoiceLower == "o" || potionChoiceLower =="n" ){

        }else {
            System.out.println("Veuillez saisir O ou N");
            takePotion();
        }
    }

    //ShowHeroes METHOD////////////////
    protected void showHeroes(final  List<Hero> heroes){
        for (Hero hero : heroes) {
            if (hero != null) {
                System.out.println(hero.id + "/ " + hero.name + ": " + " Attaque : " + hero.att + ", Defense : " + hero.def + ", Vie : " + hero.health);
            }
        }
    }

    //Select Hero Method------------------------------------------

    Hero heroSelected;
    protected void selectHero(int heroChoice){
        switch (heroChoice){
            case 1 : heroSelected = initHeroes().get(0);
                break;
            case 2 : heroSelected = initHeroes().get(1);
                break;
            case 3 : heroSelected = initHeroes().get(2);
                break;
            default: System.out.println("Veuillez sélectionner un hero valide");
        }
    }

    protected void showMonster(final int monsterIndex){
        Monster monster = initMonsters().get(monsterIndex);
        System.out.println(monster.name + ": " + " Attaque : " + monster.att + ", Defense : " + monster.def + ", Vie : " + monster.health);
    }

    //Random Monsters METHOD///////////////////////////
    //TO END /!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\
    protected void randomMonstersTurn(final List<Monster> monsters){
        int monsterCount = 0;
        for(Monster monster : monsters){
            monsterCount++;
        }
        for(Monster monster : monsters){
            //Array of monsters id
            List<Integer> randomIdList = new ArrayList<>();
            //Generate random id from 0 to number of monsters & add to randomIdList
           int randomId = (int)(Math.random()*(monsterCount)+1);
           randomIdList.add(randomId);
           System.out.println(randomId);
           //Check if Id as already been assigned
           for(int id : randomIdList){
               if(randomId != id){
                   monster.id = randomId;
                   System.out.println(monster.id + "/ " + monster.name + ": " + " Attaque : " + monster.att + ", Defense : " + monster.def + ", Vie : " + monster.health);
               }
           }
        }
    }


}
