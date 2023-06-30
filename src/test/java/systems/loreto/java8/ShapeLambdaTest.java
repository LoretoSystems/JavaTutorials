package systems.loreto.java8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeLambdaTest {

    @Test
    void calculate_area() {
        ShapeFunctionalInterface square = (int number) -> number * number;

        int result = square.calculate(3);

        assertEquals(9, result);
    }

    @FunctionalInterface
    interface ShapeFunctionalInterface {
        int calculate(int number);
    }
}