package Dice;

import java.util.Random;

public class CheatedRandomNumber implements NumberGenerator {
    @Override
    public int randomNumber() {
        Random random = new Random();
        int i = random.nextInt(3);
        return i;
    }
}
