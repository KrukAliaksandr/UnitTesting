package com.epam.tat.module4.testng;

import com.epam.tat.module4.DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends BaseTest {

    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void cosZeroDegreesTest() {
        Assert.assertEquals(calculator.cos(Math.toRadians(0)), Math.cos(Math.toRadians(0)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void cosThirtyDegreesTest() {
        Assert.assertEquals(calculator.cos(Math.toRadians(30)), Math.cos(Math.toRadians(30)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  cosFourtyFiveDegreesTest() {
        Assert.assertEquals(calculator.cos(Math.toRadians(45)), Math.cos(Math.toRadians(45)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  cosSixtyDegreesTest() {
        Assert.assertEquals(calculator.cos(Math.toRadians(60)), Math.cos(Math.toRadians(60)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  cosNintyDegreesTest() {
        Assert.assertEquals(calculator.cos(Math.toRadians(90)), Math.cos(Math.toRadians(90)));
    }
}
