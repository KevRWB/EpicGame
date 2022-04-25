package Battle;

public class Potion {

    //HEALTH POTION METHOD
    protected boolean haveHealthPotion = true;

    protected void takeHealthPotion(Hero hero){
        haveHealthPotion = false;
        hero.health += 30;
    }

    //ATTACK POTION
    protected boolean haveAttackPotion = true;
    protected int countTurnAttackPotion;

    protected void takeAttackPotion(Hero hero){
        haveAttackPotion = false;
        countTurnAttackPotion = 3;
        hero.att += 20;
    }

    //INITIATIVE POTION
    protected boolean haveInitiativePotion = true;
    protected int countTurnInitiativePotion;
    protected boolean hasInitiative = false;
    protected void takeInitiativePotion(Hero hero){
        haveInitiativePotion = false;
        countTurnInitiativePotion = 3;
        hasInitiative = true;

    }
}
