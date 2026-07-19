package kata;

import static kata.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class FizzBuzzTest
{
    @Test
    void testFizz() {
        String actual = fizzBuzz(9);
        String expected = "Fizz";

        assertEquals(expected, actual);
    }

    @Test
    void testBuzz() {
        String actual = fizzBuzz(10);
        String expected = "Buzz";

        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz() {
        String actual = fizzBuzz(15);
        String expected = "FizzBuzz";

        assertEquals(expected, actual);
    }

    @Test
    void testNoFizzOrBuzz() {
        String actual = fizzBuzz(7);
        String expected = "7";

        assertEquals(expected, actual);
    }
}
