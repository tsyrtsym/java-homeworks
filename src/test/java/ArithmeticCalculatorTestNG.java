package test.java;

import main.java.ArithmeticCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticCalculatorTestNG {
    
    @Test
    public void testAddition() {
        assertEquals(ArithmeticCalculator.add(3, 5), 8);
    }
    
    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticCalculator.subtract(10, 4), 6);
    }
    
    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticCalculator.multiply(6, 7), 42);
    }
    
    @Test
    public void testDivision() {
        assertEquals(ArithmeticCalculator.divide(15, 3), 5.0);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivisionByZero() {
        ArithmeticCalculator.divide(10, 0);
    }
}
