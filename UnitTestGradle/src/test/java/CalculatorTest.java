import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        Calculator tester = new Calculator();
        tester.multiply(1000, 5);
    }

    @Test
    public void testMultiply() {
        Calculator tester = new Calculator();
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
    }
}
