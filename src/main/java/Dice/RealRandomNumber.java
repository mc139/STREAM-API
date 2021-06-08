package Dice;

import java.util.Random;

public class RealRandomNumber implements NumberGenerator {

    @Override
    public int randomNumber() {
        Random random = new Random();
        int i = random.nextInt(6);
        return i;
    }
}
