package Battle;
import java.util.ArrayList;

public class Fight {

    public static void main(String[] args) {
        RollD10 roll = new RollD10();
        int diceResult = roll.roll();

        while(diceResult != 5){
            diceResult = roll.roll();
            System.out.println(diceResult);
        }

        System.out.println("Dice result : " + diceResult);

        System.out.println("Le combat commence !");
        System.out.println("Votre hero est ");
    }
}
