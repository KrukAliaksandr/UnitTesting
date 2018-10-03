package com.epam.tat.module4.testng;

import com.epam.tat.module4.DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SqrtTest extends BaseTest {

    @Test(dataProvider = "RightNumbersForSqrtFunctionGenerator",dataProviderClass = DataProviderClass.class,groups = "advanced_calc_functions")
    public void positiveSqrtTest(double a) {
        Assert.assertEquals(calculator.sqrt(a), Math.sqrt(a));
    }
    @Test(expectedExceptions = Exception.class,groups = "advanced_calc_functions")
    public void negativeSqrtTest () {
        Assert.assertEquals(calculator.sqrt(-5.35), Math.sqrt(-5.35));
    }

}
