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
    public void testSelectSortAscending() {
        int[] nums = { 2, 3 ,5, 6, 11, 12 };

        int[] actual = selectSort(nums);
        int[] expected = { 2, 3 ,5, 6, 11, 12 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDescending() {
        int[] nums = { 101, 100, 22, 7, 6, 4, 2, 1, 0 };

        int[] actual = selectSort(nums);
        int[] expected = { 0, 1, 2, 4, 6, 7, 22, 100, 101 };

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
