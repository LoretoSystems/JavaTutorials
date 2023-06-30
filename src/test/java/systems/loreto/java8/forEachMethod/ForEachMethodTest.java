package systems.loreto.java8.forEachMethod;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForEachMethodTest {

    @Test
    void for_each() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        StringBuilder result = new StringBuilder();

        fruits.forEach(fruit -> result.append(fruit).append(" "));

        assertEquals("Apple Banana Orange ", result.toString());
    }
}
