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
    private Random r;
    private ArrayList<Integer> validDie;
    private String label;
    private int mod;
    private int amount;

    /**
     * Default constructor
     * @param amount amount of dice
     * @param nSides number of sides on the die
     * @param mod assigns a modifier to the die roll
     * @throws IllegalArgumentException if nSides is invalid
     */
    public Die(int amount, int nSides, int mod) {
        validDie = new ArrayList<Integer>();
        r = new Random();
        this.amount = amount;
        this.mod = mod;
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
    public String roll() {
        int res = 0;
        for(int i = 0; i < amount; i++)
            res += r.nextInt(nSides) + 1;
        res += mod;
        String result = String.valueOf(res);
        
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
        String a = String.valueOf(amount);
        switch(nSides) {
            case 4:
                label = a + "d4+" + String.valueOf(mod);
                break;
            case 6:
                label = a + "d6+" + String.valueOf(mod);
                break;
            case 8:
                label = a +  "d8+" + String.valueOf(mod);
                break;
            case 10:
                label = a + "d10+" + String.valueOf(mod);
                break;
            case 12:
                label = a + "d12+" + String.valueOf(mod);
                break;
            case 20:
                label = a + "d20+" + String.valueOf(mod);
                break;
            case 100:
                label = a + "d100+" + String.valueOf(mod);
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
