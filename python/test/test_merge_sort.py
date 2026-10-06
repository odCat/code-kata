from hypothesis import note, given, strategies as some

from kata.merge_sort import merge_sort, merge


class TestMergeSort(object):

    def test_merge_sort(self):
        nums = [ 5, 3, 8, 4, 2 ]

        actual = merge_sort(nums)
        expected = [ 2, 3, 4, 5, 8 ]

        assert actual == expected

    @given(some.lists(some.integers()))
    def test_list_size_is_invariant(self, a_list: list[int]):
        original_length = len(a_list)
        assert original_length == len(merge_sort(a_list))

    @given(some.lists(some.integers()))
    def test_elements_are_ascending(self, a_list: list[int]):
        merge_sort(a_list)
        for i in range(len(a_list)-1):
            assert a_list[i] <= a_list[i+1]

    @given(some.lists(some.integers()))
    def test_compare_with_sorted(self, a_list: list[int]):
        assert merge_sort(a_list) == sorted(a_list)

    def test_merge_sort_empty_list(self):
        nums = []

        actual = merge_sort(nums)
        expected = []

        assert actual == expected

    def test_merge_sort_one_element(self):
        nums = [ 1 ]

        actual = merge_sort(nums)
        expected = [ 1 ]

        assert actual == expected

    def test_merge(self):
        first = [ 2, 9, 10 ]
        second = [0, 3, 12, 13 ]

        actual = merge(first, second)
        expected = [ 0, 2, 3, 9, 10, 12, 13 ]

        assert actual == expected


    def test_merge_with_empty_list(self):
        first = []
        second = [0, 3, 12, 13]

        actual = merge(first, second)
        expected = [0, 3, 12, 13]

        assert actual == expected

    @given(some.lists(some.integers()), some.lists(some.integers()))
    def test_total_numbers_is_invariant(self, first: list[int], second: list[int]):
        assert len(merge(first, second)) == len(first) + len(second)

    @given(some.lists(some.integers()).map(sorted),
           some.lists(some.integers()).map(sorted))
    def test_elements_are_ascending(self, first: list[int], second: list[int]):
        merged = merge(first, second)
        for i in range(len(merged)-1):
            assert merged[i] <= merged[i+1]
