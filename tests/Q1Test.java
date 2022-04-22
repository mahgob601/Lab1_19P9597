import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1Test {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testfruitDivisor()
    {
        Q1 tester = new Q1();
        Assert.assertEquals("8 should give YES", "YES", tester.fruitDivisor(8));
    }
}