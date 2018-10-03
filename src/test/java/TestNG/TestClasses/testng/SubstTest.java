package TestNG.TestClasses.testng;

import TestNG.DataProviders.DataProviderClass;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class SubstTest extends BaseTest {


    @Test(dataProvider = "PositiveTestDoubleNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void DoubleTest(double a, double b) {
        Assert.assertEquals(calculator.sub(a, b), a - b);
    }

    @Test(dataProvider = "NegativeTestDoubleNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void DoubleNegativeTest(double a, double b) {
        Assert.assertEquals(calculator.sub(a, b), a - b);
    }

    @Test(dataProvider = "PositiveTestLongNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void LongTest(long a, long b) {
        Assert.assertEquals(calculator.sub(a, b), a - b);
    }

    @Test(dataProvider = "NegativeTestLongNumberGenerator", dataProviderClass = DataProviderClass.class, groups = {"basic_calc_functions"})
    public void longNegativeTest(long a, long b) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(a, b), a - b)
        ;
    }

}
