public class Hero {

    String name;
    String race;
    int health;
    int initiative;
    int moral;

    public Hero(String name, String race, int health, int initiative, int moral){
        this.name = name;
        this.race = race;
        this.health = health;
        this.initiative = initiative;
        this.moral = moral;
    }

    public static void main(String[] args){

        Hero Kevin = new Hero("Kevin", "Human", 70, 70, 70);
    }

}
