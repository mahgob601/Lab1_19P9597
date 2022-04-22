import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class Q2Test extends TestCase {
    @Test(timeout = 2000)
    public void testinEquilibrium()
    {
        // Here is an equilibrium test case
        Q2 tester2 = new Q2();
        int[][] testArr = {{3,-1,7},{-5,2,-4},{2,-1,-3}};
        Assert.assertEquals("Should give YES","YES",tester2.inEquilibrium(3,testArr));

    }

    @Test(timeout = 2000)
    public void testNotinEquilibriumTrue()
    {
        // Here is not an equilibrium test case
        Q2 tester1 = new Q2();
        int[][] testArr = {{4,1,7},{-2,4,-1},{1,-5,-3}};
        Assert.assertEquals("Should give NO","NO",tester1.inEquilibrium(3,testArr));

    }


    @Test(timeout = 2000)
    public void testinEquilibriumErrorCase()
    {
        // Here is an error as one element of the array is < -100
        Q2 tester2 = new Q2();
        int[][] testArr = {{3,-1,7},{-5,-200,-4},{2,-1,-3}};
        Assert.assertEquals("Should give ERROR as value < -100","ERROR",tester2.inEquilibrium(3,testArr));

    }

    @Test(timeout = 2000)
    public void testinEquilibriumErrorCase2()
    {
        // Here is an error as array size is > 100
        Q2 tester2 = new Q2();
        int[][] testArr = {{3,-1,7},{-5,2,-4},{2,-1,-3}};
        Assert.assertEquals("Should give ERROR as array size is > 100","ERROR",tester2.inEquilibrium(101,testArr));

    }
}