import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DiceBagTest.
 *
 * @author  Even A. Nilsen
 * @version v0.1 10.05.2015
 */
public class DiceBagTest
{
    private DiceBag dBag1;

    /**
     * Default constructor for test class DiceBagTest
     */
    public DiceBagTest()
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
        dBag1 = new DiceBag("One");
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
    public void labelTest()
    {
        assertEquals("One", dBag1.getLabel());
    }
}
