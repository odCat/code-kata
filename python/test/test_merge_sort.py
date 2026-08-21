from kata.merge_sort import merge_sort, merge


class TestMergeSort(object):

    def test_merge_sort(self):
        nums = [ 5, 3, 8, 4, 2 ]

        actual = merge_sort(nums)
        expected = [ 2, 3, 4, 5, 8 ]

        assert actual == expected

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
