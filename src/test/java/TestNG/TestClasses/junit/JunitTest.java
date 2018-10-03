package TestNG.TestClasses.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

@RunWith(value = Parameterized.class)

public class JunitTest {

        private long a;
        private long b;
        private long expectedResult;
        private Calculator calculator;

        public JunitTest(long a, long b, long expectedResult){
            this.a = a;
            this.b = b;
            this.expectedResult = expectedResult;
        }

        @Before
        public void setUp(){
            calculator = new Calculator();
        }

        @Test
        public void sumLongTest(){
            long actualResult = calculator.sum(a, b);
            assertEquals(expectedResult, actualResult);
        }

        @After
        public void tearDown(){
            calculator = null;
        }

        @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
        public static Iterable<Object[]> dataForTest() {
            return Arrays.asList(new Object[][]{
                    {154, 126, 280},
                    {-9, -3, -12},
                    {9, -3, 6},
                    {-9, 3, -6},
                    {0, 5, 5},
                    {5, 0, 5},
                    {0, -9, -9},
                    {-9, 0, -9},
                    {-Long.MAX_VALUE, 33, (33 - Long.MAX_VALUE)},
                    {33, -Long.MAX_VALUE, (33 - Long.MAX_VALUE)},
                    {-Long.MIN_VALUE, 457, (457 - Long.MIN_VALUE)},
                    {457, -Long.MIN_VALUE, (457 - Long.MIN_VALUE)},
                    {Long.MIN_VALUE, 423, (423 + Long.MIN_VALUE)},
                    {423, Long.MIN_VALUE, (423 + Long.MIN_VALUE)},
                    {Long.MAX_VALUE, 483, (483 + Long.MAX_VALUE)},
                    {483, Long.MAX_VALUE, (483 + Long.MAX_VALUE)},
            });
        }

    }

