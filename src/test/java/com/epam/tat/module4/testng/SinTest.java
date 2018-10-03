package com.epam.tat.module4.testng;

import com.epam.tat.module4.DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {

    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void sinZeroDegreesTest() {
        Assert.assertEquals(calculator.sin(Math.toRadians(0)), Math.sin(Math.toRadians(0)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void sinThirtyDegreesTest() {
        Assert.assertEquals(calculator.sin(Math.toRadians(30)), Math.sin(Math.toRadians(30)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  sinFourtyFiveDegreesTest() {
        Assert.assertEquals(calculator.sin(Math.toRadians(45)), Math.sin(Math.toRadians(45)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  sinSixtyDegreesTest() {
        Assert.assertEquals(calculator.sin(Math.toRadians(60)), Math.sin(Math.toRadians(60)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  sinNintyDegreesTest() {
        Assert.assertEquals(calculator.sin(Math.toRadians(90)), Math.sin(Math.toRadians(90)));
    }
}
