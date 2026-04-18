package test.java;

import main.java.TriangleArea;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {
    
    @Test
    @DisplayName("Площадь треугольника: основание 5, высота 10 = 25")
    void testAreaWithPositiveValues() {
        assertEquals(25.0, TriangleArea.calculate(5, 10));
    }
    
    @Test
    @DisplayName("Площадь треугольника с нулевым основанием бросает исключение")
    void testAreaWithZeroBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(0, 10));
    }
    
    @Test
    @DisplayName("Площадь треугольника с отрицательной высотой бросает исключение")
    void testAreaWithNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(5, -3));
    }
}
