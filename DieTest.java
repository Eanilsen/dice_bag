import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DieTest.
 *
 * @author  Even A. Nilsen
 * @version v0.1 08.05.2015
 */
public class DieTest
{
    private Die d4;
    private Die d6;
    private Die d8;
    private Die d10;
    private Die d12;
    private Die d20;
    private Die d100;

    /**
     * Default constructor for test class DieTest
     */
    public DieTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        d4 = new Die(1, 4, 0);
        d6 = new Die(1, 6, 0);
        d8 = new Die(1, 8, 0);
        d10 = new Die(1, 10, 0);
        d12 = new Die(1, 12, 0);
        d20 = new Die(1, 20, 0);
        d100 = new Die(1, 100, 0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void labelTestd4()
    {
        assertEquals("1d4+0", d4.getLabel());
    }

    @Test
    public void labelTestd6()
    {
        Die die1 = new Die(2, 6, 0);
        assertEquals("2d6+0", die1.getLabel());
    }

    @Test
    public void labelTestd8()
    {
        Die die1 = new Die(3, 8, 0);
        assertEquals("3d8+0", die1.getLabel());
    }

    @Test
    public void labelTestd10()
    {
        Die die1 = new Die(4, 10, 0);
        assertEquals("4d10+0", die1.getLabel());
    }

    @Test
    public void labelTestd12()
    {
        Die die1 = new Die(5, 12, 0);
        assertEquals("5d12+0", die1.getLabel());
    }

    @Test
    public void labelTestd20()
    {
        Die die1 = new Die(6, 20, 0);
        assertEquals("6d20+0", die1.getLabel());
    }

    @Test
    public void labelTestd100()
    {
        Die die1 = new Die(7, 100, 0);
        assertEquals("7d100+0", die1.getLabel());
    }

    @Test
    public void rollTestd4()
    {
        String result = "";
        int high = 4;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d4.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void rollTestd6()
    {
        String result = "";
        int high = 6;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d6.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void rollTestd8()
    {
        String result = "";
        int high = 8;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d8.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void rollTestd10()
    {
        String result = "";
        int high = 10;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d10.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void rollTestd12()
    {
        String result = "";
        int high = 12;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d12.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void rollTestd20()
    {
        String result = "";
        int high = 20;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d20.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void rollTestd100()
    {
        String result = "";
        int high = 100;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            result = d100.roll();
            int test = Integer.parseInt(result);
            assertTrue("Error, value too high.", test <= high);
            assertTrue("Error, value too low", test >= low);
        }
    }

    @Test
    public void sidesTestd4()
    {
        assertEquals(4, d4.getSides());
    }

    @Test
    public void sidesTestd6()
    {
        assertEquals(6, d6.getSides());
    }

    @Test
    public void sidesTestd8()
    {
        assertEquals(8, d8.getSides());
    }

    @Test
    public void sidesTestd10()
    {
        assertEquals(10, d10.getSides());
    }

    @Test
    public void sidesTestd12()
    {
        assertEquals(12, d12.getSides());
    }

    @Test
    public void sidesTestd20()
    {
        assertEquals(20, d20.getSides());
    }

    @Test
    public void sidesTestd100()
    {
        assertEquals(100, d100.getSides());
    }
}
