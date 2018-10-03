package testng;

import DataProviders.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {
    
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"},expectedExceptions = Exception.class)
    public void tanZeroDegreesTest() {
        Assert.assertEquals(calculator.ctg(Math.toRadians(0)), 1/(Math.tan(Math.toRadians(0))));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void tanThirtyDegreesTest() {
        Assert.assertEquals(calculator.ctg(Math.toRadians(30)), 1/(Math.tan(Math.toRadians(30))));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  tanFourtyFiveDegreesTest() {
        Assert.assertEquals(calculator.ctg(Math.toRadians(45)), 1/(Math.tan(Math.toRadians(45))));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  tanSixtyDegreesTest() {
        Assert.assertEquals(calculator.ctg(Math.toRadians(60)), 1/(Math.tan(Math.toRadians(60))));
    }
    @Test(dataProviderClass = DataProviderClass.class,groups = {"trigonometric_functions"})
    public void  tanNintyDegreesTest() {
        Assert.assertEquals(calculator.ctg(Math.toRadians(90)), 1/(Math.tan(Math.toRadians(90))));
    }

}
