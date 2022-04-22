public class Monster {

    //Non-static Variables for Monster
    int id;
    String name;
    String race;
    int health;
    int initiative;
    int moral;

    //Constructor for Monster
    public Monster(int id, String name, String race, int health, int initiative, int moral){
        this.id = id;
        this.name = name;
        this.race = race;
        this.health = health;
        this.initiative = initiative;
        this.moral = moral;
    }

    public static void main(String[] args){

        //Create new Monster(s)
        Monster orc = new Monster(1,"Green Orc", "Orc", 60, 40, 30 );
        Monster bat = new Monster(2,"Bat", "Animal", 15, 40, 10 );
        Monster witch = new Monster(3,"Witch", "Human", 30, 60, 70);
        //Print values of Monster(s)
        System.out.println(orc);
        System.out.println(bat);
        System.out.println(witch);
    }

    //toString Method to print instances values
    public String toString(){
        return "This monster is " + this.name +" (id : " + this.id +"). He's a " + this.race + ". Stats are : Health : " + this.health + ", Initiative : " + this.initiative + ", moral : " + this.moral ;
    }

}
