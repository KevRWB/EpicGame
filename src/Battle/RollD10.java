package Battle;

public class RollD10 {

    int roll() {
        int result = (int) (Math.random() * 11);
        return result;
    }

    public static void main(String[] args) {
        RollD10 rollD10 = new RollD10();
    }
}


