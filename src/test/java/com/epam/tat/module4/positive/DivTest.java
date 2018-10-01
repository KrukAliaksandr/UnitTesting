package com.epam.tat.module4.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class DivTest {
    private double a,b;
    @DataProvider(name = "NegativeAndNullDoubleGenerator")
    public Iterator<Object[]> createRandomNumbers() {
        a = ThreadLocalRandom.current().nextDouble(0.00001,10000.00001);
        b = ThreadLocalRandom.current().nextDouble(0.00001, 10000.00001);
        return Arrays.asList(new Object[][]
                {
                        {new ArrayList<>(Arrays.asList(a, b))},
                        {new ArrayList<>(Arrays.asList(a,-b))},
                        {new ArrayList<>(Arrays.asList(-a, b))},
                        {new ArrayList<>(Arrays.asList(-a,-b))},
                        {}
                }).iterator();
    }
    @Test(dataProvider = "NegativeAndNullDoubleGenerator")
    public void DoubleTest(ArrayList<Double> data) {
        Calculator calculatorFortTest = new Calculator();
        Assert.assertEquals(calculatorFortTest.div(data.get(0),data.get(1)),data.get(0) / data.get(1));
    }
}
