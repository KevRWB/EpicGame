public class Monster {
    String name;
    String race;
    int health;
    int initiative;
    int moral;

    public Monster(String name, String race, int health, int initiative, int moral){
        this.name = name;
        this.race = race;
        this.health = health;
        this.initiative = initiative;
        this.moral = moral;
    }

    public static void main(String[] args){
        Monster orc = new Monster("Green Orc", "Orc", 60, 40, 30 );
        Monster bat = new Monster("Bat", "Animal", 15, 40, 10 );
        Monster witch = new Monster("Witch", "Human", 30, 60, 70);
    }

}
