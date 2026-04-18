package test.java;

import main.java.TriangleArea;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTestNG {
    
    @Test
    public void testAreaWithPositiveValues() {
        assertEquals(TriangleArea.calculate(5, 10), 25.0);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithZeroBase() {
        TriangleArea.calculate(0, 10);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeHeight() {
        TriangleArea.calculate(5, -3);
    }
}
