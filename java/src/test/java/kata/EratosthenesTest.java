package kata;

import static kata.Eratosthenes.findPrimes;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;
import org.junit.jupiter.api.Test;


public class EratosthenesTest
{
    @Test
    void testEratosthenes() {
        int[] actual = findPrimes(20);
        int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19 };

        assertArrayEquals(expected, actual);
    }

    @Test
    void testLastElementIsPrime() {
        int[] actual = findPrimes(23);
        int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };

        assertArrayEquals(expected, actual);
    }

    @Property
    void testPrimesAreLess(@ForAll @IntRange(min = 0, max = 1000) int n) {
        assertTrue(findPrimes(n).length <= n);
    }

    @Property
    void testEachIsPrime(@ForAll @IntRange(min = 2, max = 1000) int n) {
        int[] primes = findPrimes(n);
        for (int i = 0; i < primes.length; ++i) {
            assertTrue(isPrime(primes[i]));
        }
    }

    @Property
    void testElementsAreOrderedAndDoNotRepeat(@ForAll @IntRange(min = 2, max = 1000) int n) {
        int[] primes = findPrimes(n);
        for (int i = 0; i < primes.length-1; ++i) {
            assertTrue(primes[i] < primes[i+1]);
        }
    }

    boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); ++i)
            if (num % i == 0)
                return false;
        return true;
    }
}
