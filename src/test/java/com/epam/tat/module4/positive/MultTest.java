package com.epam.tat.module4.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class MultTest {

    private double a,b;
    @DataProvider(name = "NegativeAndNullDoubleGenerator")
    public Iterator<Object[]> createRandomNumbers() {
        a = ThreadLocalRandom.current().nextDouble(0.1,10000.01);
        b = ThreadLocalRandom.current().nextDouble(0.1, 10000.01);
        return Arrays.asList(new Object[][]
                {

                        {new ArrayList<>(Arrays.asList(a, b))},
                        {new ArrayList<>(Arrays.asList(a,-b))},
                        {new ArrayList<>(Arrays.asList(-a, b))},
                        {new ArrayList<>(Arrays.asList(-a,-b))},
                        {new ArrayList<>(Arrays.asList(0.0, 0.0))},
                        {new ArrayList<>(Arrays.asList(a,0.0))},
                        {new ArrayList<>(Arrays.asList(0.0, b))},
                        {new ArrayList<>(Arrays.asList(-a,0.0))},
                        {new ArrayList<>(Arrays.asList(0.0,-b))},


                }).iterator();
    }
    @Test(dataProvider = "NegativeAndNullDoubleGenerator")
    public void DoubleTest(ArrayList<Double> data) {
        Calculator calculatorFortTest = new Calculator();
        Assert.assertEquals(calculatorFortTest.mult(data.get(0),data.get(1)),(data.get(0) * data.get(1)));
    }
}
