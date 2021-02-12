
public class Die {
    private String diceType;
    private int numSides;
    private int sideUp;

    public Die() {
        diceType = "d6";
        numSides = 6;
        sideUp = ((int)(Math.random() * numSides)) + 1;
    }

    public Die(final int numSides) {
        diceType = "d" + Integer.toString(numSides);
        this.numSides = numSides;
        sideUp = ((int)(Math.random() * numSides)) + 1;
    }

    public Die(final int numSides, final String diceType) {
        this.diceType = diceType;
        this.numSides = numSides;
        sideUp = ((int)(Math.random() * numSides)) + 1;
    }

    public int getSideUp() {
        return sideUp;
    }

    public int getNumSides() {
        return numSides;
    }

    public String getDiceType() {
        return diceType;
    }

    public void setSideUp(final int num) {
        sideUp = num;
    }

    public int roll() {
        sideUp = ((int)(Math.random() * numSides)) + 1;
        return sideUp;
    }
}
