package systems.loreto.java8.defaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {

    @Test
    void functionality() {
        BasicCalculator calculator = new BasicCalculator();

        int sum = calculator.add(4, 3);
        assertEquals(7, sum);

        int difference = calculator.subtract(8, 3);
        assertEquals(5, difference);
    }
}
