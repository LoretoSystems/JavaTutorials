package systems.loreto.java8.optionalclass;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void divide_valid_input() {
        Calculator calculator = new Calculator();
        Optional<Integer> result = calculator.divide(10, 2);

        assertTrue(result.isPresent());
        assertEquals(5, result.get());
    }

    @Test
    void divide_by_zero() {
        Calculator calculator = new Calculator();
        Optional<Integer> result = calculator.divide(10, 0);

        assertFalse(result.isPresent());
    }
}
