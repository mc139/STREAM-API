package Dice;

public class CheatedDice extends Dice {
    public CheatedDice(String name) {
        super(name);
        this.numberGenerator = new CheatedRandomNumber();
    }
}
