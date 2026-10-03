from hypothesis import given
import hypothesis.strategies as some

from kata.bubble_sort import bubble_sort


class TestBubbleSort(object):

    def test_bubble_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = bubble_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_bubble_sort_empty_list(self):
        nums = []

        actual = bubble_sort(nums)
        expected = []

        assert actual == expected


    def test_bubble_sort_one_element(self):
        nums = [1]

        actual = bubble_sort(nums)
        expected = [1]

        assert actual == expected

    @given(some.lists(some.integers()))
    def test_list_size_is_invariant(self, nums: list[int]):
        original_length = len(nums)
        nums = bubble_sort(nums)
        assert original_length == len(nums)

    @given(some.lists(some.integers()))
    def test_elements_are_ascending(self, nums: list[int]):
        nums = bubble_sort(nums)
        for i in range(1, len(nums)):
            assert nums[i-1] <= nums[i]

