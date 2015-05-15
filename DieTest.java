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
        d4 = new Die(4);
        d6 = new Die(6);
        d8 = new Die(8);
        d10 = new Die(10);
        d12 = new Die(12);
        d20 = new Die(20);
        d100 = new Die(100);
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
        assertEquals("d4", d4.getLabel());
    }

    @Test
    public void labelTestd6()
    {
        assertEquals("d6", d6.getLabel());
    }

    @Test
    public void labelTestd8()
    {
        assertEquals("d8", d8.getLabel());
    }

    @Test
    public void labelTestd10()
    {
        assertEquals("d10", d10.getLabel());
    }

    @Test
    public void labelTestd12()
    {
        assertEquals("d12", d12.getLabel());
    }

    @Test
    public void labelTestd20()
    {
        assertEquals("d20", d20.getLabel());
    }

    @Test
    public void labelTestd100()
    {
        assertEquals("d100", d100.getLabel());
    }

    @Test
    public void rollTestd4()
    {
        int high = 4;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d4.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
        }
    }

    @Test
    public void rollTestd6()
    {
        int high = 6;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d6.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
        }
    }

    @Test
    public void rollTestd8()
    {
        int high = 8;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d8.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
        }
    }

    @Test
    public void rollTestd10()
    {
        int high = 10;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d10.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
        }
    }

    @Test
    public void rollTestd12()
    {
        int high = 12;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d12.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
        }
    }

    @Test
    public void rollTestd20()
    {
        int high = 20;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d20.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
        }
    }

    @Test
    public void rollTestd100()
    {
        int high = 100;
        int low = 1;
        for(int i = 0; i < 10; i++) {
            int result = d100.roll();
            assertTrue("Error, value too high.", result <= high);
            assertTrue("Error, value too low", result >= low);
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
