package kata;

import org.junit.jupiter.api.Test;

import static kata.SelectSort.selectSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SelectSortTest
{
    @Test
    public void testSelectSort() {
        int[] nums = { 5, 3, 8, 4, 2 };

        int[] actual = selectSort(nums);
        int[] expected = { 2, 3, 4, 5, 8 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortEmpty() {
        int[] nums = {};

        int[] actual = selectSort(nums);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortOneElement() {
        int[] nums = { 5 };

        int[] actual = selectSort(nums);
        int[] expected = { 5 };

        assertArrayEquals(expected, actual);
    }
}
