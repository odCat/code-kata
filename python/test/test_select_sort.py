from hypothesis import given, strategies as some

from kata.select_sort import select_sort


class TestSelectSort(object):

    def test_select_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = select_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_select_sort_empty_list(self):
        nums = []

        actual = select_sort(nums)
        expected = []

        assert actual == expected


    def test_select_sort_one_element(self):
        nums = [1]

        actual = select_sort(nums)
        expected = [1]

        assert actual == expected

    @given(some.lists(some.integers()))
    def test_size_is_invariant(self, a_list: list[int]):
        original_length = len(a_list)
        assert original_length == len(select_sort(a_list))

    @given(some.lists(some.integers()))
    def test_elements_are_ascending(self, a_list: list[int]):
        select_sort(a_list)
        for i in range(1, len(a_list)):
            assert a_list[i-1] <= a_list[i]

    @given(some.lists(some.integers()))
    def test_compare_with_sorted(self, a_list: list[int]):
        assert select_sort(a_list) == sorted(a_list)