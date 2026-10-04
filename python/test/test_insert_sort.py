from hypothesis import given, strategies as some

from kata.insert_sort import insert_sort


class TestInsertSort(object):

    def test_insert_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = insert_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_insert_sort_empty_list(self):
        nums = []

        actual = insert_sort(nums)
        expected = []

        assert actual == expected


    def test_insert_sort_one_element(self):
        nums = [1]

        actual = insert_sort(nums)
        expected = [1]

        assert actual == expected

    @given(some.lists(some.integers()))
    def test_size_is_invariant(self, a_list: list[int]):
        print(f"called with: {a_list}")
        original_length = len(a_list)
        assert original_length == len(insert_sort(a_list))

    @given(some.lists(some.integers()))
    def test_elements_are_ascending(self, a_list: list[int]):
        insert_sort(a_list)
        for i in range(1, len(a_list)):
            assert a_list[i-1] <= a_list[i]

    @given(some.lists(some.integers()))
    def test_compare_with_sorted(self, a_list: list[int]):
        assert insert_sort(a_list) == sorted(a_list)