package test.java;

import main.java.ArithmeticCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticCalculatorTest {
    
    @Test
    @DisplayName("Сложение: 3 + 5 = 8")
    void testAddition() {
        assertEquals(8, ArithmeticCalculator.add(3, 5));
    }
    
    @Test
    @DisplayName("Вычитание: 10 - 4 = 6")
    void testSubtraction() {
        assertEquals(6, ArithmeticCalculator.subtract(10, 4));
    }
    
    @Test
    @DisplayName("Умножение: 6 * 7 = 42")
    void testMultiplication() {
        assertEquals(42, ArithmeticCalculator.multiply(6, 7));
    }
    
    @Test
    @DisplayName("Деление: 15 / 3 = 5")
    void testDivision() {
        assertEquals(5.0, ArithmeticCalculator.divide(15, 3));
    }
    
    @Test
    @DisplayName("Деление на ноль бросает исключение")
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> ArithmeticCalculator.divide(10, 0));
    }
}
