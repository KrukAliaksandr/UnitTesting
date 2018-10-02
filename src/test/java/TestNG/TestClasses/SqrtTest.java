package TestNG.TestClasses;

import TestNG.DataProviders.DataProviderClass;
import TestNG.TestClasses.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SqrtTest extends BaseTest {

    @Test(dataProvider = "RightNumbersForSqrtFunctionGenerator",dataProviderClass = DataProviderClass.class)
    public void positiveSqrtTest(double a) {
        Assert.assertEquals(calculator.sqrt(a), Math.sqrt(a));
    }
    @Test(expectedExceptions = Exception.class)
    public void negativeSqrtTest () {
        Assert.assertEquals(calculator.sqrt(-5.35), Math.sqrt(-5.35));
    }

}
