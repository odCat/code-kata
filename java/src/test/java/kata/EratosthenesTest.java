package kata;

import static kata.Eratosthenes.findPrimes;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class EratosthenesTest {

    @Test
    void testEratosthenes() {
        int[] actual = findPrimes(20);
        int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19 };

        assertArrayEquals(expected, actual);
    }
}
