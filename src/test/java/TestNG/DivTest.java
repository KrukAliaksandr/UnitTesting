package testng;

import DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest extends BaseTest {
    @Test(dataProvider = "PositiveTestDoubleNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void doubleTest(double a, double b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }

    @Test(dataProvider = "NegativeTestDoubleNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void doubleNegativeTest(double a, double b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }

    @Test(groups = {"basic_calc_functions"}, expectedExceptions = Exception.class)
    public void doubleDivisionByZeroTest() {
        Assert.assertEquals(calculator.div(-3.0, 0.0), -3.0 / 0.0);
    }
    @Test(groups = {"basic_calc_functions"}, expectedExceptions = Exception.class)
    public void doubleZeroDivideOnZeroTest() {
        Assert.assertEquals(calculator.div(-3.0, 0.0), 0.0 / 0.0);
    }

    @Test(dataProvider = "PositiveTestLongNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void longtest(long a, long b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }

//    @Test(dataProvider = "NegativeTestLongNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
//    public void longNegativeTest(long a, long b) {
//        Assert.assertEquals(calculator.div(a, b), a / b);
//    }
}
