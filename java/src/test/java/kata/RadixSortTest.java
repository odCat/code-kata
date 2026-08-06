package kata;

import static kata.RadixSort.radixSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class RadixSortTest
{
   @Test
    public void testRadixSort() {
        int[] nums = { 342, 58923, 1, 98, 98798, 58939 };

        int[] actual = radixSort(nums);
        int[] expected = { 1, 98, 342, 58923, 58939, 98798 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRadixSortEmpty() {
        int[] nums = {};

        int[] actual = radixSort(nums);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRadixSortOneElement() {
        int[] nums = { 5 };

        int[] actual = radixSort(nums);
        int[] expected = { 5 };

        assertArrayEquals(expected, actual);
    }
}
