package testng;

import DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegative extends BaseTest {

    @Test(dataProvider = "NumbersForPositiveNegativeChecksGenerator",dataProviderClass = DataProviderClass.class,groups = "advanced_calc_functions")
    public void DoubleTest(long a) {
        Assert.assertEquals(calculator.isNegative(a),a<0L);
    }

}
