package test.java;

import main.java.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTestNG {
    
    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.calculate(0), 1);
    }
    
    @Test
    public void testFactorialOfOne() {
        assertEquals(Factorial.calculate(1), 1);
    }
    
    @Test
    public void testFactorialOfFive() {
        assertEquals(Factorial.calculate(5), 120);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegative() {
        Factorial.calculate(-5);
    }
}
