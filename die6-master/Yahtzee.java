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
            
            if(value == 1) {
                count[0]++;
            } else if (value == 2) {
                count[1]++;
            } else if (value == 3) {
                count[2]++;
            } else if (value == 4) {
                count[3]++;
            } else if (value == 5) {
                count[4]++;
            } else if (value == 6) {
                count[5]++;
            }
        }
        
        
        //now youre gonna print result
        for (int i=0; i<numberOfSides; i++) {
            String stringValues = String.valueOf(i+1) + "-" + String.valueOf(count[i]);
            if (i<numberOfSides - 1) {
                stringValues= stringValues + "; ";
            }
            
            str = str + stringValues;
        }
        return str;
    }
}
