import static com.sun.tools.doclint.Entity.not;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
