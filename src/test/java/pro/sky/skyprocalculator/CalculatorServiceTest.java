package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    public void plus() {
        assertEquals("5", calculatorServiceImpl.plus(2, 3));
        assertEquals("10",calculatorServiceImpl.plus(7,8));
    }

    @Test
    public void minus() {
        assertEquals("11", calculatorServiceImpl.minus(15, 4));
    }

    @Test
    public void multiply() {
        assertEquals("30", calculatorServiceImpl.multiply(10, 3));
    }

    @Test
    public void div() {
        assertEquals("10", calculatorServiceImpl.div(50, 5));
        assertThrows(IllegalArgumentException.class,
                ()-> calculatorServiceImpl.div(50,0));
    }

}