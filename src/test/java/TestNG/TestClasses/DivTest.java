package TestNG.TestClasses;

import TestNG.DataProviders.DataProviderClass;
import TestNG.TestClasses.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest extends BaseTest {
    @Test(dataProvider = "PositiveTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void DoubleTest(double a,double b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }

    @Test(dataProvider = "NegativeTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void DoubleNegativeTest(double a, double b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }
    @Test(dataProvider = "PositiveTestLongNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void LongTest(long a,long b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }

    @Test(dataProvider = "NegativeTestLongNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void DoubleNegativeTest(long a, long b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }
}
