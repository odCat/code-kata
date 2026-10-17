package kata;

import static kata.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
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

    @Property
    void testEveryFifteenthElementStartsWithFizz(@ForAll("dividedByThreeAndFive") int number) {
        assertTrue(fizzBuzz(number).startsWith("FizzBuzz"));
    }

    @Property
    void testEveryThirdElementStartsWithFizz(@ForAll("dividedByThree") int number) {
        assertTrue(fizzBuzz(number).startsWith("Fizz"));
    }

    @Property
    void testEveryFifthElementStartsWithFizz(@ForAll("dividedByFive") int number) {
        assertTrue(fizzBuzz(number).startsWith("Buzz"));
    }

    @Property
    void testReturnsNumberOtherwise(@ForAll("notDividedByThreeOrFive") int number) {
        assertEquals(fizzBuzz(number), String.valueOf(number));
    }

    @Provide
    Arbitrary<?> dividedByThreeAndFive() {
        return Arbitraries.integers().filter(x -> x % 15 == 0);
    }

    @Provide
    Arbitrary<?> dividedByThree() {
        return Arbitraries.integers().filter(x -> x != 0 && x % 3 == 0 && x % 5 != 0);
    }

    @Provide
    Arbitrary<?> dividedByFive() {
        return Arbitraries.integers().filter(x -> x != 0 && x % 5 == 0 && x % 3 != 0);
    }

    @Provide
    Arbitrary<?> notDividedByThreeOrFive() {
        return Arbitraries.integers().filter(x -> x % 3 != 0 && x % 5 != 0);
    }
}
