package testng;

import DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PowTest extends BaseTest {

    @Test(dataProvider = "PositiveTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = "advanced_calc_functions")
    public void powTest(double a,double b) {
        Assert.assertEquals(calculator.pow(a,b), Math.pow(a,b));
    }
    @Test(dataProvider = "NegativeTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class)
    public void negativePowTest (double a,double b) {
        Assert.assertEquals(calculator.pow(a,b), Math.pow(a,b));
    }

}
