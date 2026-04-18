package test.java;

import main.java.NumberComparator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {
    
    @Test
    @DisplayName("Сравнение: 5 > 3 возвращает 1")
    void testCompareGreater() {
        assertEquals(1, NumberComparator.compare(5, 3));
    }
    
    @Test
    @DisplayName("Сравнение: 2 < 7 возвращает -1")
    void testCompareLess() {
        assertEquals(-1, NumberComparator.compare(2, 7));
    }
    
    @Test
    @DisplayName("Сравнение: 4 = 4 возвращает 0")
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(4, 4));
    }
    
    @Test
    @DisplayName("isGreater: 10 > 5 = true")
    void testIsGreater() {
        assertTrue(NumberComparator.isGreater(10, 5));
        assertFalse(NumberComparator.isGreater(3, 8));
    }
    
    @Test
    @DisplayName("isEqual: 7 = 7 = true")
    void testIsEqual() {
        assertTrue(NumberComparator.isEqual(7, 7));
        assertFalse(NumberComparator.isEqual(5, 9));
    }
}
