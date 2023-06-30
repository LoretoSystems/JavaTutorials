package systems.loreto.java8.functionalinterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testCalculatorFunctionality() {
        Calculator calculator = new Calculator();
        int sum = calculator.performOperation(5, 3, Integer::sum);
        assertEquals(8, sum);

        CalculatorOperation subtraction = (a, b) -> a - b;
        int difference = calculator.performOperation(10, 4, subtraction);
        assertEquals(6, difference);
    }
}