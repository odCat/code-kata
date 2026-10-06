package kata;

import org.junit.jupiter.api.Test;
import static kata.BinarySearch.search;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinarySearchTest {

    @Test
    void testElementIsNotFound() {
        int[] arr = { 2, 3, 4, 9 };

        assertEquals(-1, search(arr, 20));
    }

    @Test
    void testElementIsFoundInTheMiddle() {
        int[] arr = { 2, 3, 4, 9, 100 };

        assertEquals(2, search(arr, 4));
    }

    @Test
    void testElementIsFoundAtTheBeginning() {
        int[] arr = { 2, 3, 4, 9, 100 };

        assertEquals(0, search(arr, 2));
    }

    @Test
    void testElementIsFoundAtTheEnd() {
        int[] arr = { 2, 3, 4, 9, 100 };

        assertEquals(4, search(arr, 100));
    }
}
