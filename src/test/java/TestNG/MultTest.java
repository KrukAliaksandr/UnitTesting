package testng;

import DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MultTest extends BaseTest {

    @Test(dataProvider = "PositiveTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void DoubleTest(double a, double b ) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }

    @Test(dataProvider = "NegativeTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void DoubleNegativeTest(double a,double b ) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }
    @Test(dataProvider = "PositiveTestLongNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void LongTest(long a, long b ) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }

    @Test(dataProvider = "NegativeTestLongNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void LongNegativeTest(long a,long b ) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }
}
