package TestNG.TestClasses.testng;

import TestNG.DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositive extends BaseTest {

    @Test(dataProvider = "NumbersForPositiveNegativeChecksGenerator",dataProviderClass = DataProviderClass.class)
    public void DoubleTest(long a) {
            Assert.assertEquals(calculator.isPositive(a), a> 0L);
    }

}