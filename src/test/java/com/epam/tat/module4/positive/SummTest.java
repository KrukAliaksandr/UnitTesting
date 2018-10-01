package com.epam.tat.module4.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Long.sum;


@Test
public class SummTest {
    private double a,b;
    @DataProvider(name = "PositiveTestNumberGenerator")
    public Iterator<Object[]> getNumbersForPositiveTest() {
        a = ThreadLocalRandom.current().nextDouble(0.00001,10000.00001);
        b = ThreadLocalRandom.current().nextDouble(0.00001, 10000.00001);
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
    @DataProvider(name = "ProviderWithMinimumValues")
    public Iterator<Object[]> getMinimumValuesForNegativeTest() {
        a = ThreadLocalRandom.current().nextDouble(0.00001,10000.00001);
        return Arrays.asList(new Object[][]
                {

                        {new ArrayList<>(Arrays.asList(a, Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(a,-Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(-a, Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(-a,-Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(Double.MIN_VALUE,Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(Double.MIN_VALUE, -Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(-Double.MIN_VALUE,Double.MIN_VALUE))},
                        {new ArrayList<>(Arrays.asList(-Double.MIN_VALUE,-Double.MIN_VALUE))},

                }).iterator();
    }
    @DataProvider(name = "ProviderWithMaximumValues")
    public Iterator<Object[]> getMaximumValuesForNegativeTest() {
        a = ThreadLocalRandom.current().nextDouble(0.00001,10000.00001);
        return Arrays.asList(new Object[][]
                {
                        {new ArrayList<>(Arrays.asList(a, Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(a,-Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(-a, Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(-a,-Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(Double.MAX_VALUE,Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(Double.MAX_VALUE, -Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(-Double.MAX_VALUE,Double.MAX_VALUE))},
                        {new ArrayList<>(Arrays.asList(-Double.MAX_VALUE,-Double.MAX_VALUE))},

                }).iterator();
    }


    @Test(dataProvider = "PositiveTestNumberGenerator")
    public void DoubleTest(ArrayList<Double> data) {
Calculator calculatorFortTest = new Calculator();
    Assert.assertEquals(calculatorFortTest.sum(data.get(0),data.get(1)),data.get(0) + data.get(1));
}

}
