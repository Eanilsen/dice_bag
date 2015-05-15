import java.util.ArrayList;

/**
 * DiceSetup - Defines setups with multiple dice
 *
 * @author Even A. Nilsen
 * @version v0.1 11.05.2015
 */
public class DiceSetup
{
    private ArrayList<Die> dice;
    private int amount;
    private int mod;
    private String label;

    /**
     * Default constructor
     */
    public DiceSetup() {
        dice = new ArrayList<Die>();
        mod = 0;
        amount = 0;
        label = "";
    }

    /**
     *
     */
    protected void addDie(int amount, int nSides, int mod) {
        for(int i = 0; i < amount; i++) {
            dice.add(new Die(nSides));
        }
    }

    protected void addLabel(int amount, String label, int mod) {
        String a = String.valueOf(amount);
        String m = String.valueOf(mod);
        System.out.println(a + label + m);
    }
}
