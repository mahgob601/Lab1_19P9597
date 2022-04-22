import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class Q1Test {
    

    @Test(timeout = 1000)
    public void testfruitDivisor()
    {
        Q1 tester = new Q1();
        Q1 tester2 = new Q1();
        Assert.assertEquals("8 should give YES", "YES", tester.fruitDivisor(8));
    }
    @Test(timeout = 1000)
    public void testfruitDivisorInvalidCase()
    {
        Q1 tester = new Q1();
        Assert.assertEquals("0 should give NO", "NO", tester.fruitDivisor(0));
    }

    @Test(timeout = 1000)
    public void testfruitDivisorError()
    {
        Q1 tester = new Q1();
        Assert.assertEquals("7 should give NO", "NO", tester.fruitDivisor(7));
    }
}