import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Die - Emulates a single die
 *
 * @author Even A. Nilsen
 * @version v0.1 01.05.2015
 */
public class Die
{
    private int nSides;
    private Random randDie;
    private ArrayList<Integer> validDie;
    private String label;

    /**
     * Default constructor
     * @param nSides number of sides on the die
     * @throws IllegalArgumentException if nSides is invalid
     */
    public Die(int nSides) {
        validDie = new ArrayList<Integer>();
        randDie = new Random();
        validDies();
        addLabel(nSides);

        if(validDie.contains(nSides)) {
            this.nSides = nSides;
        }
        else {
            throw new IllegalArgumentException("Invalid number of sides.");
        }
    }

    /**
     * Rolls the die
     * @return result
     */
    public int roll() {
        int result = randDie.nextInt(nSides) + 1;
        return result;
    }

    /**
     * Returns the number of sides
     * @return nSides
     */
    public int getSides() {
        return nSides;
    }

    /**
     * Returns the die label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    protected void validDies() {
        validDie.add(4);
        validDie.add(6);
        validDie.add(8);
        validDie.add(10);
        validDie.add(12);
        validDie.add(20);
        validDie.add(100);
    }

    /**
     * Assigns a label to the die
     * @param nSides number of sides on the die
     */
    protected void addLabel(int nSides) {
        switch(nSides) {
            case 4:
                label = "d4";
                break;
            case 6:
                label = "d6";
                break;
            case 8:
                label = "d8";
                break;
            case 10:
                label = "d10";
                break;
            case 12:
                label = "d12";
                break;
            case 20:
                label = "d20";
                break;
            case 100:
                label = "d100";
                break;
        }
    }

    /**
     * Sets up a comparator used to sort the dice according to the number of
     * sides.
     * @return ascending list of dice
     */
    public static Comparator<Die> sorter = new Comparator<Die>() {
        @Override
        public int compare(Die d1, Die d2) {
            int side1 = d1.getSides();
            int side2 = d2.getSides();

            return side1-side2;
        }
    };
}
