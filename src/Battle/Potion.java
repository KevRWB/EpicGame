package Battle;

public class Potion {
    String name;
    boolean hasPotion;

    public Potion(String name, boolean hasPotion){
        this.name = name;
        this.hasPotion = hasPotion;
    }

    protected void takePotion(){
        hasPotion = false;
    }
}


class HealthPotion extends Potion{
    int healthPts;
    public HealthPotion(String name, boolean hasPotion, int healthPts){
        super(name, hasPotion);
        this.healthPts = healthPts;
    }
}

class AttackPotion extends Potion{
    int attPts;
    int turns;
    public AttackPotion(String name, boolean hasPotion, int attPts, int turns){
        super(name, hasPotion);
        this.attPts = attPts;
        this.turns = turns;
    }
}

class InitiativePotion extends Potion{
    int turns;
    public InitiativePotion(String name, boolean hasPotion, int turns){
        super(name, hasPotion);
        this.turns = turns;
    }
}