package kata;

import static kata.QuickSort.quickSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class QuickSortTest
{
    @Test
    public void testQuickSort() {
        int[] nums = { 5, 3, 8, 4, 2 };

        int[] actual = quickSort(nums);
        int[] expected = { 2, 3, 4, 5, 8 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortEmpty() {
        int[] nums = {};

        int[] actual = quickSort(nums);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortOneElement() {
        int[] nums = { 5 };

        int[] actual = quickSort(nums);
        int[] expected = { 5 };

        assertArrayEquals(expected, actual);
    }
}
