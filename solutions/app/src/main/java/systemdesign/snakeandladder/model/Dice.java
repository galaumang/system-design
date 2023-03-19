package systemdesign.snakeandladder.model;

import java.util.Random;

public class Dice {
    int nosOnDice;
    Random random;

    Dice(int nosOnDice) {
        this.nosOnDice = nosOnDice;
        this.random = new Random();
    }

    public int rollDice() {
        return random.nextInt(nosOnDice) + 1;
    }
}
