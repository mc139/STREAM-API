package Dice;

public class Dice {

    private final String name;
    protected NumberGenerator numberGenerator;

    public Dice(String name) {
        this.name = name;
    }

    public void setDiceBehaviour(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void roll(){
        int i = numberGenerator.randomNumber();
        System.out.println("Number is: " +i);
    }
}
