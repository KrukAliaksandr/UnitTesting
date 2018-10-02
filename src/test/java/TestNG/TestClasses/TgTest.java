package TestNG.TestClasses;

import TestNG.DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {

    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void tanZeroDegreesTest() {
        Assert.assertEquals(calculator.tg(Math.toRadians(0)), Math.tan(Math.toRadians(0)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void tanThirtyDegreesTest() {
        Assert.assertEquals(calculator.tg(Math.toRadians(30)), Math.tan(Math.toRadians(30)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  tanFourtyFiveDegreesTest() {
        Assert.assertEquals(calculator.tg(Math.toRadians(45)), Math.tan(Math.toRadians(45)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  tanSixtyDegreesTest() {
        Assert.assertEquals(calculator.tg(Math.toRadians(60)), Math.tan(Math.toRadians(60)));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  tanNintyDegreesTest() {
        Assert.assertEquals(calculator.tg(Math.toRadians(90)), Math.tan(Math.toRadians(90)));
    }

}
