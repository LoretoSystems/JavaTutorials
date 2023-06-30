package systems.loreto.java8.methodreferences;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void functionality() {
        BiFunction<Integer, Integer, Integer> addition = Calculator::add;
        int sum = addition.apply(5, 3);
        assertEquals(8, sum);
    }
}
