package TestNG.TestClasses;

import TestNG.DataProviders.DataProviderClass;
import TestNG.TestClasses.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PowTest extends BaseTest {

    @Test(dataProvider = "PositiveTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class)
    public void powTest(double a,double b) {
        Assert.assertEquals(calculator.pow(a,b), Math.pow(a,b));
    }
    @Test(dataProvider = "NegativeTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class)
    public void negativePowTest (double a,double b) {
        Assert.assertEquals(calculator.pow(a,b), Math.pow(a,b));
    }

}
