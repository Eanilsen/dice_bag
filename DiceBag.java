import java.util.ArrayList;
import java.util.Collections;

/**
 * DiceBag - Contains die objects and rolls them. Should be able to save a
 * profile to file so the user can save and use different setups.
 *
 * @author Even A. Nilsen
 * @version v0.1 05.05.2015
 */
public class DiceBag
{
    private ArrayList<Die> dice;
    private String label;

    /**
     * Default constructor
     * @param label used to identify the dice bag
     */
    public DiceBag(String label) {
        this.label = label;
        dice = new ArrayList<Die>();
        addDefaultDice();
    }

    /**
     * Creates and adds one of each of the 7 dice
     */
    protected void addDefaultDice() {
        dice.add(new Die(1, 4, 0));
        dice.add(new Die(1, 6, 0));
        dice.add(new Die(1, 8, 0));
        dice.add(new Die(1, 10, 0));
        dice.add(new Die(1, 12, 0));
        dice.add(new Die(1, 20, 0));
        dice.add(new Die(1, 100, 0));
    }

    /**
     * Prints the contents of the dice bag
     */
    public void printDice() {
        Collections.sort(dice, Die.sorter);
        for(Die d : dice) {
            System.out.println(d.getLabel());
        }
    }

    /**
     * Lets the user add dice
     * @param amount amount of the chosen die
     * @param nSides number of sides on the die
     * @param mod accounts for the chosen modifier
     */
    public void addDie(int amount, int nSides, int mod) {
            dice.add(new Die(amount, nSides, mod));
    }

    /**
     * Returns the dica bags label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Finds a die object and returns it. Returns null if not found.
     * @param label what to search for
     * @return d
     */
    protected Die findDie(String label) {
        for(Die d : dice) {
            if(label.equals(d.getLabel()))
                return d;
        }
        return null;
    }

    /**
     * Search and remove all occurences with the chosen label
     * @param label what to search for
     */
    public void removeDie(String label) {
        ArrayList<Die> rList = new ArrayList<Die>();
        for(Die d : dice) {
            if(label.equals(d.getLabel()))
                rList.add(d);
        }
        dice.removeAll(rList);
    }
}
