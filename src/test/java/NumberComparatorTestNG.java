package test.java;

import main.java.NumberComparator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTestNG {
    
    @Test
    public void testCompareGreater() {
        assertEquals(NumberComparator.compare(5, 3), 1);
    }
    
    @Test
    public void testCompareLess() {
        assertEquals(NumberComparator.compare(2, 7), -1);
    }
    
    @Test
    public void testCompareEqual() {
        assertEquals(NumberComparator.compare(4, 4), 0);
    }
    
    @Test
    public void testIsGreater() {
        assertTrue(NumberComparator.isGreater(10, 5));
        assertFalse(NumberComparator.isGreater(3, 8));
    }
    
    @Test
    public void testIsEqual() {
        assertTrue(NumberComparator.isEqual(7, 7));
        assertFalse(NumberComparator.isEqual(5, 9));
    }
}
