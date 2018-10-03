package com.epam.tat.module4.testng;

import com.epam.tat.module4.DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SumTest extends BaseTest {

    @Test
            (dataProvider = "PositiveTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void doubleTest(double a, double b) {
        
        Assert.assertEquals(calculator.sum(a, b), a + b);
    }

    @Test
            (dataProvider = "NegativeTestDoubleNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void doubleNegativeTest(double a, double b) {
        
        Assert.assertEquals(calculator.sum(a,b),a + b);
    }
    @Test
            (dataProvider = "PositiveTestLongNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void longTest(long a, long b) {
        
        Assert.assertEquals(calculator.sum(a, b), a + b);
    }

    @Test
            (dataProvider = "NegativeTestLongNumberGenerator",dataProviderClass = DataProviderClass.class,groups = {"basic_calc_functions"})
    public void longNegativeTest(long a, long b) {
        
        Assert.assertEquals(calculator.sum(a,b),a + b);
    }
}
