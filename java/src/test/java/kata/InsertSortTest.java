package kata;

import static kata.InsertSort.insertSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class InsertSortTest
{
    @Test
    public void testInsertSort() {
        int[] nums = { 5, 3, 8, 4, 2 };

        int[] actual = insertSort(nums);
        int[] expected = { 2, 3, 4, 5, 8 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortAscending() {
        int[] nums = { 2, 3 ,5, 6, 11, 12 };

        int[] actual = insertSort(nums);
        int[] expected = { 2, 3 ,5, 6, 11, 12 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDescending() {
        int[] nums = { 101, 100, 22, 7, 6, 4, 2, 1, 0 };

        int[] actual = insertSort(nums);
        int[] expected = { 0, 1, 2, 4, 6, 7, 22, 100, 101 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortEmpty() {
        int[] nums = {};

        int[] actual = insertSort(nums);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortOneElement() {
        int[] nums = { 5 };

        int[] actual = insertSort(nums);
        int[] expected = { 5 };

        assertArrayEquals(expected, actual);
    }
}
