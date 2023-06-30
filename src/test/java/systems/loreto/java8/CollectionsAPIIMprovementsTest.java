package systems.loreto.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsAPIIMprovementsTest {

    @Test
    void stream_and_parallel_stream_methods() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .toList();

        assertEquals("APPLE", upperCaseFruits.get(0));
        assertEquals("BANANA", upperCaseFruits.get(1));
        assertEquals("ORANGE", upperCaseFruits.get(2));
    }

    @Test
    void sort_method() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        fruits.sort(String::compareToIgnoreCase);

        assertEquals("Apple", fruits.get(0));
        assertEquals("Banana", fruits.get(1));
        assertEquals("Orange", fruits.get(2));
    }

    @Test
    void compute_if_absent_and_compute_if_present_methods() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 90);

        scores.putIfAbsent("Alice", 80);
        scores.computeIfPresent("John", (key, value) -> value + 10);

        assertEquals(100, scores.get("John"));
        assertEquals(80, scores.get("Alice"));
    }
}
