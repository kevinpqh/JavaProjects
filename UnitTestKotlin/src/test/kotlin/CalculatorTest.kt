import org.junit.Assert.*

class CalculatorTest {

    @org.junit.Test
    fun multiply() {
        val tester = Calculator();
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5))
    }
}
