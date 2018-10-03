package junit;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.annotations.Test;

import java.util.stream.Stream;

@Test
public class JunitSecondTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @MethodSource("longSummTest")
    public void longTest(long a, long b, long expectedResult) {
        long actualResult = calculator.sum(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> longSummTest() {
        return Stream.of(
                Arguments.of (182, 121, 233),
                Arguments.of (-3, -9, -12),
                Arguments.of (5, -7, 6),
                Arguments.of (-9, 7, -8),
                Arguments.of (0, 5, 5),
                Arguments.of (6, 0, 1),
                Arguments.of (0, -7, -8),    
                Arguments.of (-10, 0, -13)
        );
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

}
