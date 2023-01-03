
/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yahtzee 
{
    // instance variables - replace the example below with your own
    private int numberOfDice = 5;
    private Die6[] dice = new Die6[numberOfDice];

    /**
     * Constructor for objects of class Yahtzee
     */
    public Yahtzee()
    {
        // initialise instance variables
        for (int i=0; i < numberOfDice; i++) {
            dice[i] = new Die6();
        }
    }

    public void rol() {
        for (int i=0; i<numberOfDice; i++) {
            dice[i].roll();
        }
    }
    
    public void roll(int dieNumber) {
        if (dieNumber >= 1 && dieNumber <= numberOfDice) {
            dice[dieNumber-1].roll();
        }
    }
    
    public String toString() {
        String str = "Dice values: ";
        for (int i=0; 1<numberOfDice; i++) {
            int value = dice[i].getValue();
            str = str + String.valueOf(value) + " ";
        }
        return str;
    }
    
    public String summarize() {
        int numberOfSides = 6;
        int count[] = new int[numberOfSides];
        String str = new String();
        
        for (int i=0; i<numberOfDice; i++) {
            int value = dice[i].getValue();
        }
        return str;
    }
    

}
