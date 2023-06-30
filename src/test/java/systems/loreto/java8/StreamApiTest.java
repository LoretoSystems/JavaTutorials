package systems.loreto.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamApiTest {

    @Test
    void square_numbers_from_a_list() {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        assertEquals(
                Arrays.asList(1, 4, 9, 16, 25, 36),
                squaredNumbers);
    }
}
