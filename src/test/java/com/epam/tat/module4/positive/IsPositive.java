package com.epam.tat.module4.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class IsPositive {
    private Long a;
    @DataProvider(name = "NegativeAndNullDoubleGenerator")
    public Iterator<Object[]> createRandomNumbers() {
        a = ThreadLocalRandom.current().nextLong(1L,10000L);
        return Arrays.asList(new Object[][]
                {
                        {new ArrayList<>(Arrays.asList(a,-a,0L ))},
                }).iterator();
    }
    @Test(dataProvider = "NegativeAndNullDoubleGenerator")
    public void DoubleTest(ArrayList<Long> data) {
        Calculator calculatorFortTest = new Calculator();
        for(Long longForCheck:data)
            Assert.assertEquals(calculatorFortTest.isPositive(longForCheck),longForCheck>0L);
    }

}
