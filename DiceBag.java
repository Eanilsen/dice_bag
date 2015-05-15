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
        dice.add(new Die(4));
        dice.add(new Die(6));
        dice.add(new Die(8));
        dice.add(new Die(10));
        dice.add(new Die(12));
        dice.add(new Die(20));
        dice.add(new Die(100));
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
     * @param nSides number of sides on the die
     */
    public void addDie(int nSides) {
            dice.add(new Die(nSides));
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
