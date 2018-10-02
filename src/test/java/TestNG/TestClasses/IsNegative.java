package TestNG.TestClasses;

import TestNG.DataProviders.DataProviderClass;
import TestNG.TestClasses.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegative extends BaseTest {

    @Test(dataProvider = "NumbersForPositiveNegativeChecksGenerator",dataProviderClass = DataProviderClass.class)
    public void DoubleTest(long a) {
        Assert.assertEquals(calculator.isNegative(a),a<0L);
    }

}
