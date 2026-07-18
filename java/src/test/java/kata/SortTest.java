package kata;

import static kata.Sort.bubbleSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class SortTest
{
    @Test
    public void testBubbleSort() {
        int[] nums = { 5, 3, 8, 4, 2 };

        int[] actual = bubbleSort(nums);
        int[] expected = { 2, 3, 4, 5, 8 };

        assertArrayEquals(expected, actual);
    }
}