public class Hero {

    // non static variables
    String name;
    String race;
    int health;
    int initiative;
    int moral;

    //Constructor
    public Hero(String name, String race, int health, int initiative, int moral){
        this.name = name;
        this.race = race;
        this.health = health;
        this.initiative = initiative;
        this.moral = moral;
    }

    public static void main(String[] args){
        // Creates New Hero(s)
        Hero Kevin = new Hero("Kevin", "Human", 70, 70, 70);

        System.out.println(Kevin);
    }

    //toString Method to print instances values
    public String toString(){
        return "This hero is " + this.name +". He's a " + this.race + ". Stats are : Health : " + this.health + ", Initiative : " + this.initiative + ", moral : " + this.moral ;
    }
}
