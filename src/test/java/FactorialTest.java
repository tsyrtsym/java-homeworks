package test.java;

import main.java.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    
    @Test
    @DisplayName("Факториал 0 = 1")
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }
    
    @Test
    @DisplayName("Факториал 1 = 1")
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculate(1));
    }
    
    @Test
    @DisplayName("Факториал 5 = 120")
    void testFactorialOfFive() {
        assertEquals(120, Factorial.calculate(5));
    }
    
    @Test
    @DisplayName("Факториал отрицательного числа бросает исключение")
    void testFactorialOfNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-5));
    }
}
