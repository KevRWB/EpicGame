package Battle;

import java.util.*;



public class GeneralStory {

    Hero heroSelected;

    // methode principale (en fait dans les codes j2ee Spring boot par exemple, on n'a qu'une méthode qui se lance et ensuite y a rien d'autre
    // à faire dans le main méthode)

    //MAIN METHOD ////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //Create Keyboard Scanner for inputs
        Scanner keyboard = new Scanner(System.in);

        //Create Instance Story
        GeneralStory story = new GeneralStory();
        //Initialize Heroes and Monsters
        List<Hero> heroes =  initHeroes();
        List<Monster> monsters = initMonsters();
        story.randomMonstersTurn(monsters);

        System.out.println("Bonjour, bienvenu dans ce programme de bataille épique.");
        System.out.println("Veuillez commencer par choisir votre héro : ");

        //show Heroes List to select
        story.showHeroes(heroes);
        System.out.println("Votre choix : ");
        int heroChoice = keyboard.nextInt();
        story.selectHero(heroChoice);
        System.out.println(story.heroSelected);
    }

    // METHODS ////////////////////////////////////////////////////////////////

    //Initialization of Heroes
    private static List<Hero> initHeroes() {
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
    private static List<Monster> initMonsters(){
        List<Monster> monsters = new ArrayList<>();
        Monster zombie = new Monster(1,"Zombie", 30, 60,60);
        monsters.add(zombie);
        Monster bat = new Monster(2,"Bat", 10,10,20);
        monsters.add(bat);
        Monster wolf = new Monster(3,"Wolf", 60, 40, 40);
        monsters.add(wolf);

        return monsters;
    }
    //ShowHeroes METHOD////////////////
    private void showHeroes(final  List<Hero> heroes){
        for (Hero hero : heroes) {
            if (hero != null) {
                System.out.println(hero.id + "/ " + hero.name + ": " + " Attaque : " + hero.att + ", Defense : " + hero.def + ", Vie : " + hero.health);
            }
        }
    }

    //Random Monsters METHOD///////////////////////////
    //TO END /!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\
    private void randomMonstersTurn(final List<Monster> monsters){
        int monsterCount = 0;
        int randomId = 0;
        for(Monster monster : monsters){
            monsterCount++;
        }
        randomId = (int)(Math.random()*(monsterCount)+1);


    }

    private void selectHero(int heroChoice){
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


}
