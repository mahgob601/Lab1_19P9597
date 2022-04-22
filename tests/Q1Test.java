import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class Q1Test {


    @Test(timeout = 1000)
    public void testfruitDivisorEven()
    {
        Q1 tester = new Q1();
        Assert.assertEquals("8 should give YES", "YES", tester.fruitDivisor(8));
    }
    @Test(timeout = 1000)
    public void testfruitDivisorInvalidCase()
    {
        Q1 tester = new Q1();
        Assert.assertEquals("0 should give ERROR", "ERROR", tester.fruitDivisor(0));
    }

    @Test(timeout = 1000)
    public void testfruitDivisorOdd()
    {
        Q1 tester = new Q1();
        Assert.assertEquals("7 should give NO", "NO", tester.fruitDivisor(7));
    }
}