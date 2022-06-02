package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    private calculator calculatorTest = new calculator();

    @Test
    public void testAdd(){
        Assertions.assertEquals(10, calculatorTest.add(6, 4));
        Assertions.assertEquals(10, calculatorTest.add(8, 2));
        Assertions.assertEquals(10, calculatorTest.add(-2, 12));
        Assertions.assertNotEquals(0, calculatorTest.add(5, 5));
    }

    @Test
    public void testSubtract(){
        Assertions.assertEquals(10, calculatorTest.subtract(14, 4));
        Assertions.assertEquals(6, calculatorTest.subtract(8, 2));
        Assertions.assertEquals(10, calculatorTest.subtract(8, -2));
        Assertions.assertNotEquals(5, calculatorTest.subtract(5, 5));
    }

    @Test
    public void testMultiply(){
        Assertions.assertEquals(36, calculatorTest.multiply(12, 3));
        Assertions.assertEquals(45, calculatorTest.multiply(9, 5));
        Assertions.assertEquals(-16, calculatorTest.multiply(8, -2));
        Assertions.assertNotEquals(45, calculatorTest.multiply(5, 5));
    }
}
