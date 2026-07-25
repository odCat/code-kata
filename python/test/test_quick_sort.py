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
