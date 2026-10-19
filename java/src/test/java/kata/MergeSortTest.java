package kata;

import java.util.Arrays;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import org.junit.jupiter.api.Test;

import static kata.MergeSort.merge;
import static kata.MergeSort.mergeSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MergeSortTest
{
    @Test
    public void testMergeSort() {
        int[] nums = { 5, 3, 8, 4, 2 };

        int[] actual = mergeSort(nums);
        int[] expected = { 2, 3, 4, 5, 8 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortAscending() {
        int[] nums = { 2, 3 ,5, 6, 11, 12 };

        int[] actual = mergeSort(nums);
        int[] expected = { 2, 3 ,5, 6, 11, 12 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortDescending() {
        int[] nums = { 101, 100, 22, 7, 6, 4, 2, 1, 0 };

        int[] actual = mergeSort(nums);
        int[] expected = { 0, 1, 2, 4, 6, 7, 22, 100, 101 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortEmpty() {
        int[] nums = {};

        int[] actual = mergeSort(nums);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortOneElement() {
        int[] nums = { 5 };

        int[] actual = mergeSort(nums);
        int[] expected = { 5 };

        assertArrayEquals(expected, actual);
    }

    @Property
    void testTheNumberOfElementsRemainsTheSame(@ForAll int[] nums) {
        int initialLength = nums.length;
        assertEquals(initialLength, mergeSort(nums).length);
    }

    @Property
    void testElementsAreOrderedAscending(@ForAll int[] nums) {
        int[] sorted = mergeSort(nums);
        for (int i = 0; i < nums.length-1; ++i) {
            assertTrue(sorted[i] <= sorted[i+1]);
        }
    }

    @Test
    void testMerge() {
        int[] expected = { 0, 0, 1, 5, 7, 11, 13 };
        int[] actual = merge(new int[] { 0, 1, 11 }, new int[] { 0, 5, 7, 13 });

        assertArrayEquals(expected, actual);
    }

    @Property
    void testNumberOfElementsIsSum(@ForAll int[] first, @ForAll int[] second) {
        int expected = first.length + second.length;
        int actual = merge(first, second).length;

        assertEquals(expected, actual);
    }

    @Property
    void testMergedElementsAreOrderedAscending(@ForAll("ascendingInts") int[] first, @ForAll("ascendingInts") int[] second) {
        int[] merged = merge(first, second);
        for (int i = 0; i < merged.length-1; ++i) {
            assertTrue(merged[i] <= merged[i+1]);
        }
    }

    @Provide
    Arbitrary<int[]> ascendingInts() {
        return Arbitraries.integers()
                .array(int[].class)
                .map(arr -> {
                    Arrays.sort(arr);
                    return arr;
                });
    }
}
