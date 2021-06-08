package Dice;

public class StandardDice extends Dice{

    public StandardDice(String name) {
        super(name);
        this.numberGenerator = new RealRandomNumber();
    }
}
