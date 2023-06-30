package systems.loreto.java8.ioImprovements;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IOImprovementsTest {

    private static final String TEST_TXT = "src/test/resources/test.txt";

    @AfterAll
    static void delete_files_create_for_test_purposes() throws IOException {
        Files.delete(Path.of(TEST_TXT));
    }

    @Test
    void read_lines_from_file() throws IOException {
        Path filePath = Path.of(TEST_TXT);
        Files.write(filePath, "Hello\nWorld\nJava 8".getBytes());

        var count = 0;
        try (Stream<String> lines = Files.lines(filePath)) {
            count = Math.toIntExact(lines.count());
        }

        assertEquals(3, count);
    }
}
