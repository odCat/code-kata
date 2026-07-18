package kata;

import static kata.Sort.bubbleSort;
import static kata.Sort.insertSort;
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

    @Test
    public void testBubbleSortEmpty() {
        int[] nums = {};

        int[] actual = bubbleSort(nums);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortOneElement() {
        int[] nums = { 5 };

        int[] actual = bubbleSort(nums);
        int[] expected = { 5 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSort() {
        int[] nums = { 5, 3, 8, 4, 2 };

        int[] actual = insertSort(nums);
        int[] expected = { 2, 3, 4, 5, 8 };

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