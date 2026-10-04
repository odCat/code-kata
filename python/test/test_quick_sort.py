from hypothesis import given, strategies as some

from kata.quick_sort import quick_sort


class TestQuickSort(object):

    def test_quick_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = quick_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_quick_sort_empty_list(self):
        nums = []

        actual = quick_sort(nums)
        expected = []

        assert actual == expected


    def test_quick_sort_one_element(self):
        nums = [1]

        actual = quick_sort(nums)
        expected = [1]

        assert actual == expected

    @given(some.lists(some.integers()))
    def test_list_size_is_invariant(self, a_list: list[int]):
        original_length = len(a_list)
        assert original_length == len(quick_sort(a_list))

    @given(some.lists(some.integers()))
    def test_elements_are_ascending(self, a_list: list[int]):
        quick_sort(a_list)
        for i in range(len(a_list)-1):
            assert a_list[i] <= a_list[i+1]

    @given(some.lists(some.integers()))
    def test_compare_with_sorted(self, a_list: list[int]):
        assert quick_sort(a_list) == sorted(a_list)
