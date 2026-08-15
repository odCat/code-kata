package kata;

import static kata.Fibonacci.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class FibonacciTest {

    @Test
    void testFibonacciTwo() {
        int actual = fibonacci(2);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void testFibonacciThree() {
        int actual = fibonacci(3);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void testFibonacciFour() {
        int actual = fibonacci(4);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
