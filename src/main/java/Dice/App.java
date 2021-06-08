package Dice;

public class App {
    public static void main(String[] args) {
        Dice cheated = new CheatedDice("cheated");
        Dice normal = new StandardDice("standard");

        for(int i = 0; i<15; i++){
            System.out.println("Cheated dice:");
            cheated.roll();
            System.out.println("Normal dice:");
            normal.roll();
        }
    }
}
