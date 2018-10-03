package junit;

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
                    {182, 121, 233},
                    {-3, -9, -12},
                    {5, -7, 6},
                    {-9, 7, -8},
                    {0, 5, 5},
                    {6, 0, 1},
                    {0, -7, -8},
                    {-10, 0, -13},
            });
        }

    }

